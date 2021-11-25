using CRUD_PRODUTO.DDD.Entities;
using CRUD_PRODUTO.DDD.Repository;
using CRUD_PRODUTO.Infra.Context;
using CRUD_PRODUTO.Infra.Repository;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CRUD_PRODUTO.Infrastructure.Repository
{
    public class UserRepository : BaseRepository<User>, IUserRepository
    {
        public UserRepository(DataContext dataContext) : base(dataContext)
        {
        }

        public bool Exist(string email, string password)
        {
            return _dataContext.User.Any(x => x.Email == email && x.Password == password);

        }
    }
}
