using CRUD_PRODUTO.Domain.Entities;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CRUD_PRODUTO.Domain.Repository
{
    public interface IProductRepository : IBaseRepository<Product>
    {
    }
}
