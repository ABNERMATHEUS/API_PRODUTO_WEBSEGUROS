using CRUD_PRODUTO.Domain.Entities;
using CRUD_PRODUTO.Domain.Repository;
using CRUD_PRODUTO.Infra.Context;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CRUD_PRODUTO.Infra.Repository
{
    public class ProductRepository : BaseRepository<Product>,IProductRepository
    {
        public ProductRepository(DataContext dataContext) : base(dataContext)
        {
        }
    }
}
