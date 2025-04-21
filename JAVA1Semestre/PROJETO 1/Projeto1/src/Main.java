import jdk.nashorn.internal.runtime.ListAdapter;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int num;
        int idade=0;
        String nome = null;
         int cpf = 0;
         String email=null;
         int codloja=0;
         int codtrab = 0;

        String desc;
        int preco;
        int kmRoda;
        String marca;
        int ano;


        Scanner sc = new Scanner(System.in);

        System.out.println("Digíte 2 para funcioário ou 1 para cliente: ");
        num =sc.nextInt();
        if(num==1) {
            sc.nextLine();
            System.out.println("Dígite seu nome: ");
            nome = sc.nextLine();
            System.out.println("Dígite sua idade: ");
            idade = sc.nextInt();
            System.out.println("Dígite seu CPF: ");
            cpf = sc.nextInt();
            sc.nextLine();
            System.out.println("Dígite seu Email: ");
            email = sc.nextLine();
            System.out.println("Dígite o código da Loja: ");
            codloja = sc.nextInt();
        }

        if(num==2) {
            sc.nextLine();
            System.out.println("Dígite seu nome: ");
            nome = sc.nextLine();
            System.out.println("Dígite sua idade: ");
            idade = sc.nextInt();
            System.out.println("Dígite seu CPF: ");
            cpf = sc.nextInt();
            sc.nextLine();
            System.out.println("Dígite seu Email: ");
            email = sc.nextLine();
            System.out.println("Dígite o código de funcionário: ");
            codtrab = sc.nextInt();
        }


       Cliente c1 = new Cliente(idade,nome,cpf,email,codloja);
        c1.setCpf(cpf);
        c1.setCodloja(codloja);
        c1.setEmail(email);

        Funcionario f1 = new Funcionario(idade,nome,cpf,email,codtrab);

        try {
            c1.setIdade(idade);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("IDADE NEGATIVA");
        }

        try
        {
            c1.setNome(nome);
        }
        catch (IllegalArgumentException e1)
        {
            System.out.println("NOME NULO");
        }

        ArrayList <Pessoa> lista= new ArrayList<Pessoa>();
        lista.add(c1);
        lista.add(f1);

        for (Pessoa c:lista)
        {
            System.out.println("Deseja remover um cliente? Se sim digíte o nome, se não digíte n:" +nome);
             sc.nextLine();
             String nome1 = sc.nextLine();
            if (nome1.equals(c.getNome()))
            {
               lista.remove(c);
                System.out.println("CLIENTE REMOVIDO");
                break;
            }
            else {
                System.out.println("NÃO DESEJA REMOVER");
            }
        }

        System.out.println("Agora vamos cadastrar o Carro:\n");
        System.out.println("Dígite a descrição do carro: ");
        desc = sc.nextLine();
        System.out.println("Dígite o preço : ");
        preco = sc.nextInt();
        System.out.println("Dígite a quantidade de KM rodado: ");
        kmRoda = sc.nextInt();
        sc.nextLine();
        System.out.println("Dígite a marca: ");
        marca = sc.nextLine();
        System.out.println("Dígite o ano do carro: ");
        ano = sc.nextInt();

        Produto p1 = new Produto(desc,preco,kmRoda,marca,ano);

        try {
            p1.setPreco(preco);
        }
        catch (IllegalArgumentException e2)
        {
            System.out.println("Não é permitido preço negativo");
        }

        try
        {
            p1.setAno(ano);
        }
        catch (IllegalArgumentException e3)
        {
            System.out.println("Não é permitido ano negativo");
        }

        ArrayList<Produto> l2 = new ArrayList<Produto>();
        l2.add(p1);

        for (Produto p:l2)
        {
            System.out.println("Deseja remover um Carro? Se sim digíte a descrição, " +
                    "se não digíte n:" +desc);
            sc.nextLine();
            String desc1 = sc.nextLine();
            if (desc1.equals(p.getDesc()))
            {
                lista.remove(p);
                System.out.println("CARRO REMOVIDO");
                break;
            }
            else {
                System.out.println("NÃO DESEJA REMOVER");
            }

        }


    }
}