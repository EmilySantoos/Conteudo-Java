package poo;

public class TestaCliente {

	public static void main(String[] args) {
		
		
		Cliente c1 = new Cliente ( "Daniel Menezes", 20, 11.2223333-5,819.16555-88, "Masculino");
    	c1.visualizar();
    
    	Cliente c2 = new Cliente("Clara aguiar",38,12556.5985,456613.98,"Feminino");
    	c2.visualizar();
    
   
    	c2.setRg(111.1111-11);
    	c2.setNome("Flora alves");
    	c2.visualizar();

}

}
