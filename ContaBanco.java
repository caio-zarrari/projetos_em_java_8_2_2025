import java.util.Scanner;
//importa um scaner que serve pra coletar imformaçoes do terminal 

//gostaria de pedir perdao pelo codigo estou no começo de programaçao em java e estou dando meu melhor 

//favor se ouver conta e senha tem que zera tudo pra "" pra textar o sitemade criaçao de conta OK

public class ContaBanco {
  public static void main(String[]args)throws InterruptedException{
    //nao sei se fis certo mas->aqui estão a as variaveis que pressisei pra faser dois a tres blocos de while 
    //cada bloco identifica ->se a conta nao tendo conta 
    Scanner scanner = new Scanner(System.in);//inicialisa a coleta de imformaçoes
    int Extrato [];
    String Conta = "a";
    int Saldo= 12;
    boolean Operacao_Log_Email=false;
    int Depositando =0;
    boolean Logando =false;
    boolean Colocando_Senha=false;
    boolean TemConta =true;//isso tem que esta igual a false
    String Agencia ="067-8";
    String SemConta = "perssebo que você não tem ou naõ logou na sua conta \n desejar \n criar \n ou logar\ndigite uma das duas opçoes";
String Senha="";
String Confirmar_Senha="";
///////////////////////OPERAÇÂO QUANDO A UMA CONTA LOGADA\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
Boolean Logado = false;

///////////////////////////////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
if(TemConta){
  String Comando2 = scanner.nextLine(); //coleta iformaçoes\\\\\\\\\\\\\\\SCANER/////SCANER//////////SCANER//////////SCANER
  if(Comando2.equals(Saldo)){
    System.out.print("seu saldo é"+Saldo);
    if(Comando2.equals("Deposito")){
      String Deposito = scanner.nextLine();
      try {
          Depositando= Integer.parseInt(Comando2); // Converte para int
        System.out.println("digite o valor para deposito para conta de "+Conta);
        
    } catch (NumberFormatException e) {
        System.out.println("Erro: Entrada inválida, não é um número!");
         Comando2 = scanner.nextLine();
        
    }
   
      

    }
    Extrato=Depositando
    if (Comando2.equals("extrato")){}

  }















}


/////////////////////////////////////////////////////
   //saudaçoes 
    System.out.print("       ola\n  bem vindo ao sidtema bancario do  Bradesco \nagencia"+Agencia+"\n:");
   
    //identifica se a conta (so é executado caso não aveja conta  )
    if(!TemConta){
    //  o primeiro bloco de while ficara rodando ate que aja um email "colocado"na verdade nao se indentificar se um variavel String contem @gmail.com
    // no final entao so é o nome  e mesmo
    while (!Operacao_Log_Email){
      Logando =true;
      System.out.print(SemConta);

      String Comando = scanner.nextLine(); //coleta iformaçoes\\\\\\\\\\\\\\\SCANER/////SCANER//////////SCANER//////////SCANER

      if (Comando.equals("criar")) { 

        System.out.print("ok vamos criar uma conta digite somente seu nome");
        Conta = scanner.nextLine();
        Senha =Comando;

        if (Logando==!TemConta){
          Conta =Conta+"@gmail.com";
        System.out.print("conta criada com suseço\n ola "+Conta+"\n defina uma senha ");
        Senha = scanner.nextLine();
       
        System.out.print("por favor confirme sua senha");
        Logando=false;
        Colocando_Senha=true;
        Operacao_Log_Email=true;


     ;};

     }; 
};
//como é dito o nome da variavel boolean colocando senha
//esse loop fica na ativa ate que aja uma senha logada
//esse loop so é ativado quando Operacao_Log_Email e = true
//coloquei esse nome por que a ideia eradar nome de operaçao mas ia ficar estranho ai coloquei esse nome 
while(Colocando_Senha){  
  Confirmar_Senha=scanner.nextLine();
  
  if (Senha.equals(Confirmar_Senha)&&!TemConta&&Colocando_Senha){
  System.out.print("revendo senha");
  Thread.sleep(1000);
  System.out.print("....");
  Thread.sleep(1000);
  System.out.print("....");
  Thread.sleep(1000);
  System.out.print("\nok sua conta esta pronta ");
  System.out.print("\nloguin feito com sucesso");
  Colocando_Senha=false;
  TemConta=true;//quando = true inicia a prossima operação 
  
     };
 if (!Senha.equals(Confirmar_Senha)&&!TemConta&&Colocando_Senha){
   System.out.print("\ndesculpe tente novamente\n");}



};
    }
//com conta e senha definidos  usuario e liberado para faser operaçoes como saldo deposito etc
while (TemConta) {

 if(!Logando){ System.out.print("ola bem vindo ao bradesco\ndigite sua agencia:\n");}
 

  String Comando_Do_Usuario = scanner.nextLine();
  if (Comando_Do_Usuario.equals(Agencia)){
    System.out.print("\ncarregando\n");

Logando=true;;}
////////////////////////////////SITEMA DE LOGUI \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
if (Logando&&TemConta){
  System.out.print("\ndigite seu loguin(esxemplo@gmail.com)\n");

if(Comando_Do_Usuario.equals(Conta)&&!Logado)
  {
   Colocando_Senha=true;

   
    
  }
}
if ( Operacao_Log_Email&&Logando&&Colocando_Senha&&TemConta &&Confirmar_Senha.equals(Senha)){ System.out.print("deu certo");
////////////////////SISTEMA DE SENHA ///////////////////////////////////////////
 ;

 

  
  System.out.print("\ndigite sUA SEMHA\n");

  System.out.print("carregando...");
  Thread.sleep(1000);
  System.out.print("10%...");
  Thread.sleep(3000);
  System.out.print(".....40%...");
  Thread.sleep(1000);
  System.out.print("...50%...");
  Thread.sleep(4000);
  System.out.print(".....70%...");
  Thread.sleep(1000);
  System.out.print("100%...");
  Thread.sleep(1000);
  System.out.print("\nLOGUIN REALIZADO=)\n");

}




  if(Comando_Do_Usuario.equals("sair")){//finalisa o loop
    break;
  };
if(TemConta&&Logado){
while(Logado){



  
}}







  };






   }


   
















  
         };
            
          
         
          
          

        