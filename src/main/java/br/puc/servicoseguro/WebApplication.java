package br.puc.servicoseguro;

import br.puc.servicoseguro.domain.*;
import br.puc.servicoseguro.repository.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableJpaAuditing
public class WebApplication extends SpringBootServletInitializer {

    @Autowired
    CityRepository cityRepository;

    @Autowired
    StateRepository stateRepository;

    @Autowired
    CountryRepository countryRepository;

    @Autowired
    AttributeRepository attributeRepository;

    @Autowired
    SellerAddressRepository sellerAddressRepository;

    @Autowired
    ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

    @Bean
    InitializingBean sendDatabase() {
        return () -> {
            //fillTable();
        };
    }


    void fillTable() throws JsonProcessingException {
        City city = cityRepository.save(new City("TUxCQ1NFUmI1ZGQx", "Serra"));
        State state = stateRepository.save(new State("BR-ES", "Espírito Santo"));
        Country country = countryRepository.save(new Country("BR", "Brasil"));

        SellerAddress sellerAddress = sellerAddressRepository.save(new SellerAddress(1017932319, city, state, country));

        Attribute brand = attributeRepository.save(new Attribute("BRAND", "Marca del producto"));
        Attribute ean = attributeRepository.save(new Attribute("EAN", "7898095297749"));

        List<Attribute> listAttribute = new ArrayList<>();
        listAttribute.add(brand);
        listAttribute.add(ean);

        Product product = new Product();
        product.setId("MLB1191972200");
        product.setSite_id("MLB");
        product.setTitle("iPhone Xs 64gb");
        product.setId_integracao(Long.valueOf(123123));
        product.setSubtitle(null);
        product.setSeller_id(Long.valueOf(386261073));
        product.setPrice(BigDecimal.valueOf(7299));
        product.setBase_price(BigDecimal.valueOf(7299));
        product.setOriginal_price(null);
        product.setCurrency_id("BRL");
        product.setInitial_quantity(5);
        product.setAvailable_quantity(2);
        product.setCondition("new");
        product.setPermalink("URLASERDADA/NOMESERVICO/PRODUTO/IDANUNCIO");
//        product.setSeller_address(sellerAddress);
//        product.setAtributes(listAttribute);

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(product);

        productRepository.save(product);
    }

}
