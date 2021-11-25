using CRUD_PRODUTO.DDD.Entities;
using Microsoft.IdentityModel.Tokens;
using System;
using System.Collections.Generic;
using System.IdentityModel.Tokens.Jwt;
using System.Linq;
using System.Security.Claims;
using System.Text;
using System.Threading.Tasks;

namespace CRUD_PRODUTO.DDD.Utils
{
    public static class JWT
    {
        
        public static string GenerateToken(User user)
        {
            var tokenHandler = new JwtSecurityTokenHandler(); //criar um token handler -> responsavel por gerar
            var key = Encoding.ASCII.GetBytes(Settings.Key_Secrets); //chave 
            var tokenDescriptor = new SecurityTokenDescriptor // descrição do que vai ter neste token
            {
                Subject = new ClaimsIdentity(new Claim[]
                {
                    new Claim(ClaimTypes.Name,user.Id.ToString()),
                    new Claim(ClaimTypes.Role,"USER_ADM"),

                }),
                Expires = DateTime.UtcNow.AddHours(2),//expiração(2horas)
                SigningCredentials = new SigningCredentials(new SymmetricSecurityKey(key), SecurityAlgorithms.HmacSha256) //criptografando a credencial
            };

            var token = tokenHandler.CreateToken(tokenDescriptor); //criando meu token;

            return tokenHandler.WriteToken(token);//transformando  
        }
    }
}
