using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CRUD_PRODUTO.Domain.Entities
{
    public class Product
    {
        [Key]
        public string Id { get; set; }
        public string site_id { get; set; }
        public string title { get; set; }

        public long id_integracao { get; set; }

        public string subtitle { get; set; } //Id do vendedor interno do seu micro serviço ou o Id que deu para o vendedor que esta publicando

        public long price { get; set; }

        public long base_price { get; set; }

        public string original_price { get; set; }
        public string currency_id { get; set; }
        public long initial_quantity { get; set; }

        public int available_quantity { get; set; }

        public DateTime start_time { get; set; }

        public DateTime stop_time { get; set; }
        public string condition { get; set; }

        public string permalink { get; set; }


        #region EF
        public long seller_id { get; set; }
        #endregion


        [ForeignKey("seller_id")]
        public SellerAddress seller_address { get; set; }
        public string seller_contact { get; set; }


        public int Id_attributes { get; set; }

        [ForeignKey("Id_attributes")]
        public IList<Attributes> attributes { get; set; }

    }
}
