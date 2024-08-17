package za.ac.cput.service;

import za.ac.cput.domain.Contact;
import za.ac.cput.domain.Product;

import java.util.List;

public interface IProductService extends IService<Product, String>{
    List<Product> getAll();
    List<Product> searchProductsByName(String name);
}
