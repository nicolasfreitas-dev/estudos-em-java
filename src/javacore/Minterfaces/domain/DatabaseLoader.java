package javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        DataLoader.super.checkPermission();
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro de retrieveMaxDataSize na classe DatabaseLoader");
    }
}
