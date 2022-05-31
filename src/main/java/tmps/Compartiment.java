package tmps;

import java.util.ArrayList;

public class Compartiment{
  private String name;
  private ArrayList<Product> compartimentProducts;

  public Compartiment(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public ArrayList<Product> getProducts() {
    return this.compartimentProducts;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void AddProduct(String titlu, String descriere, int grame, int pret){
    this.compartimentProducts.add(new Product(titlu, descriere, grame, pret));
  }

  public void RemoveProduct(int index){
    this.compartimentProducts.remove(index);
  }

  public Object copy() {
    return this;
  }

  //public void removeProductFromName(String name){
    //compartimentProducts.remove();
  //}
}
