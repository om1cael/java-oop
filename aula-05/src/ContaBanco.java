public class ContaBanco {
    public int numConta;
    protected String tipoConta;
    private String nomeDono;
    private int saldo;
    private boolean status;

    public ContaBanco(int numConta, String tipoConta, String nomeDono) {
        this.numConta = numConta;
        this.tipoConta = tipoConta;
        this.nomeDono = nomeDono;

        this.status = false;
        this.saldo = 0;
    }

    public void estadoAtual() {
        System.out.println("--------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo da Conta: " + this.getTipoConta());
        System.out.println("Dono: " + this.getNomeDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta() {
        if(status) {
            System.out.println("A conta já existe.");
            return;
        }

        if(tipoConta.equalsIgnoreCase("CC")) {
            this.saldo += 50;
        } else if(tipoConta.equalsIgnoreCase("CP")) {
            this.saldo += 150;
        }

        System.out.println("Sua conta foi criada. Por ser uma conta " + this.tipoConta + ", você iniciou com o saldo de R$" + this.saldo);
        status = true;
    }

    public void fecharConta() {
        if(saldo > 0) {
            System.out.println("Você não pode fechar a conta sem sacar todo o dinheiro.");
            return;
        } else if(saldo < 0) {
            System.out.println("Você não pode fechar uma conta estando em débito.");
            return;
        }

        System.out.println("Sua conta foi fechada.");
        status = false;
    }

    public void depositar(int quantidade) {
        if(status && quantidade > 0) {
            this.saldo += quantidade;
            System.out.println("Novo saldo: " + this.saldo);
            return;
        }

        System.out.println("Esta conta não está ativa.");
    }

    public void sacar(int quantidade) {
        if(status && quantidade <= saldo && quantidade > 0) {
            this.saldo -= quantidade;
            System.out.println("Novo saldo: " + this.saldo);
            return;
        }

        System.out.println("A conta não está ativa ou não tem dinheiro suficiente.");
    }

    public void pagarMensal() {
        if(tipoConta.equalsIgnoreCase("CC")) {
            this.saldo -= 12;
        } else if(tipoConta.equalsIgnoreCase("CP")) {
            this.saldo -= 20;
        }

        System.out.println("Sua mensalidade foi paga. Novo saldo: " + this.saldo);
    }

    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return this.tipoConta;
    }

    public void setTipoConta(String tipo) {
        if(tipo.equalsIgnoreCase("CC") || tipo.equalsIgnoreCase("CP")) {
            this.tipoConta = tipo;
        } else {
            System.out.println("Tipo de conta inválido.");
        }
    }

    public String getNomeDono() {
        return this.nomeDono;
    }

    public void setNomeDono(String nome) {
        this.nomeDono = nome;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
