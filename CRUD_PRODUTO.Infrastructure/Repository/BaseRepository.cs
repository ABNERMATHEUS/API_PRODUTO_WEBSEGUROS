using CRUD_PRODUTO.Domain.Entities;
using CRUD_PRODUTO.Domain.Repository;
using CRUD_PRODUTO.Infra.Context;
using Microsoft.EntityFrameworkCore;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CRUD_PRODUTO.Infra.Repository
{
    public abstract class BaseRepository<T> : IBaseRepository<T> where T: class
    {


        public readonly DataContext _dataContext;

        public BaseRepository(DataContext dataContext)
        {
            _dataContext = dataContext;
        }

        public async Task<T> CreateAsync(T obj)
        {
            await _dataContext.Set<T>().AddAsync(obj);
            await _dataContext.SaveChangesAsync();
            return obj;
            
        }

        public async Task<T> UpdateAsync(T obj)
        {
            _dataContext.Set<T>().Update(obj);
            await _dataContext.SaveChangesAsync();
            return obj;
        }

        public async void Delete(T obj)
        {
            _dataContext.Remove(obj);
            await _dataContext.SaveChangesAsync();
        }

        public async Task<IList<T>> GetAllAsync()
        {
            return await _dataContext.Set<T>().ToListAsync();
        }

        public async Task<T> GetByIdAsync(string Id)
        {
            return await _dataContext.Set<T>().FindAsync(Id);
        }



       
    }
}
