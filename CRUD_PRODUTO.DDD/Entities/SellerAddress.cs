using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CRUD_PRODUTO.Domain.Entities
{
    public class SellerAddress
    {
        [Key]
        public long id { get; set; }

        [ForeignKey("Id_city")]
        public City city { get; set; }

        [ForeignKey("Id_state")]
        public State state { get; set; }

        [ForeignKey("Id_country")]
        public Country country { get; set; }

        #region EF 
        public string Id_city { get; set; }
        public string Id_state { get; set; }
        public string Id_country { get; set; }
        #endregion
    }
}
