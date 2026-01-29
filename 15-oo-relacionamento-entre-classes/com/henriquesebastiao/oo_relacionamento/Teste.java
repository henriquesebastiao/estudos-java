package com.henriquesebastiao.oo_relacionamento;

public class Teste {
  public static void main() {
    Contato pessoa1 = new Contato();
    pessoa1.setNome("Henrique");

    Endereco endereco = new Endereco();
    endereco.setCidade("Colniza");
    endereco.setNumero("788");
    pessoa1.setEndereco(endereco);

    Telefone tel = new Telefone();
    tel.setDdd("66");
    tel.setTipo("casa");
    tel.setNumero("999998888");
    pessoa1.setTelefone(tel);

    // Só é possível obter os dados de endereco e telefone e alterá-los por meio dos métodos de e setter.

    System.out.println(pessoa1.getNome());
    System.out.println(pessoa1.getTelefone().getNumero());

    if (pessoa1.getEndereco().getNumero() != null) {
      System.out.println("Endereço: " + pessoa1.getEndereco().getCidade() + " " + pessoa1.getEndereco().getNumero());
    }
  }
}
