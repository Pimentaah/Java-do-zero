public class incrementoEdecremento {
    public static void main(String[] args) {
        
        // Incremento ++
        int a = 1;
        System.out.println(a++); // Aqui está imprimindo o valor a incrementando mais 1 para depois pra proxima linha
        System.out.println(a++); // Printa 2 da incrementação anterior, com o incremento também nessa linha, a proxima linha vai adicionar mais 1 igual a linha anterior.
        System.out.println(a); // por fim, aqui ele pega o total valor das incrementações anteriores resultando em 3 ao total.

        //Incremento de numeros acima de 1, aqui muda o simbolo. Antes era ++ para add 1 na variavel, nessa operação ele incremente 2 pois tem o +=2, poderia ser qualquer outro numero no lugar do 2
        System.out.println(" ----Abaixo a incrementação utilizando o simbolo += ----");
        int b = 1;
        System.out.println(b);
        b += 2;
        System.out.println(b);
        b += 2;
        System.out.println(b);

        System.out.println(" ----Abaixo a incrementação utilizando o simbolo -= ----");
        int c = 10;
        System.out.println(c);
        c  -=1;
        System.out.println(c);
        c  -=1;
        System.out.println(c);
        c  -=1;
        
        System.out.println(" ----Abaixo a incrementação utilizando o simbolo -= ----");
        double d = 10;
        System.out.println(d);
        d /= 2;
        System.out.println(d);
        d /= 2;
        System.out.println(d);

    }
}
