using CRUD_PRODUTO.DDD.Entities;
using CRUD_PRODUTO.DDD.Repository;
using CRUD_PRODUTO.DDD.Utils;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using System.Threading.Tasks;

namespace CRUD_PRODUTO.API.Controllers
{
    [Route("v1/user")]
    [ApiController]
    public class UserController : ControllerBase
    {
        [HttpPost]
        public async Task<ActionResult<User>> PostAsync([FromBody] User user, [FromServices] IUserRepository userRepository)
        {
            return Ok(await userRepository.CreateAsync(user));
        }

        [HttpGet]
        [Route("{id}")]
        public async Task<ActionResult<User>> GetByIdAsync([FromServices] IUserRepository userRepository, string id)
        {

            return Ok(await userRepository.GetByIdAsync(id));
        }

        [HttpPost]
        [Route("autenticate")]
        public ActionResult<User> Autenticate([FromBody] User user, [FromServices] IUserRepository userRepository)
        {

            if(userRepository.Exist(user.Email,user.Password))
            {
                var jwt = JWT.GenerateToken(user);
                return Ok(jwt);
            }
            else
            {
                return Unauthorized();
            }
        }

        [HttpGet]
        [Authorize]
        [Route("validationjwt")]
        public ActionResult<User> ValidationJWT()
        {
            return Ok(new { message = $"Autorizado com sucesso, id: {User.Identity.Name}" });
        }


    }
}
