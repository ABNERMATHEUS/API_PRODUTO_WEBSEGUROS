using CRUD_PRODUTO.Domain.Entities;
using CRUD_PRODUTO.Domain.Repository;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Extensions.Logging;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CRUD_PRODUTO.API.Controllers
{
    [ApiController]
    [Route("v1/product")]
    public class ProductController : ControllerBase
    {
        [HttpPost]
        public async Task<ActionResult<Product>> PostAsync([FromBody] Product product, [FromServices] IProductRepository productRepository)
        {
            return Ok(await productRepository.CreateAsync(product));
        }

        [HttpGet]
        public async Task<ActionResult<Product>> GetAllAsync([FromServices] IProductRepository productRepository)
        {
            return Ok(await productRepository.GetAllAsync());
        }

        [HttpGet]
        [Route("{id}")]
        public async Task<ActionResult<Product>> GetByIdAsync([FromServices] IProductRepository productRepository, string id)
        {
            return Ok(await productRepository.GetByIdAsync(id));
        }
    }
}
