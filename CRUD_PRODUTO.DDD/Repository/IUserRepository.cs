using CRUD_PRODUTO.DDD.Entities;
using CRUD_PRODUTO.Domain.Repository;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CRUD_PRODUTO.DDD.Repository
{
    public interface IUserRepository : IBaseRepository<User>
    {
        bool Exist(string email, string password);
    }
}
