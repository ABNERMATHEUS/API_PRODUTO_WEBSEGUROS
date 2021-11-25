using CRUD_PRODUTO.Domain.Entities;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CRUD_PRODUTO.Domain.Repository
{
    public interface IBaseRepository<T> where T : class
    {
        Task<T> CreateAsync(T obj);
        Task<T> UpdateAsync(T obj);
        void Delete(T obj);
        Task<IList<T>> GetAllAsync();
        Task<T> GetByIdAsync(string Id);
    }
}
