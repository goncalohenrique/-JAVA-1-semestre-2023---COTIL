
    public class SimuladorCaixaBanco{

            private static int numeroDoCliente;
            private int numeroDoCaixa;
            private int numero;
            public void SimuladorCaixaBanco(int n)
            {
                numeroDoCaixa = n;
                numeroDoCliente = 0;
                numero+=numeroDoCaixa;
                numero++;
                System.out.println("Caixa "+numeroDoCaixa+" iniciou operação.");
            }
            public void proximoAtendimento()
            {
                numeroDoCliente+=numero;
                System.out.print("Cliente com a senha numero "+numeroDoCliente+" , favor ");
                System.out.println("dirigir-s ao caixa no "+numeroDoCaixa+".");

            }
        }


