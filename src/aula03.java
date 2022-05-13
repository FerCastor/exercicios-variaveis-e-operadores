public class aula03 {

    public static void main(String[] args) {

        System.out.println("### Prefixado e Pós-fixado ###");
        prePos();
        System.out.println();
        System.out.println("### Aritmético ###");
        aritmetico();
        System.out.println();
        System.out.println("### Atribuição ###");
        atribuicao();
        System.out.println("### Precedência ###");
        precedencia();

    }

    private static void prePos(){
    // VARIÁVEL DECLARADA:
        int k = 10;

    // OPERAÇÕES E RESULTADOS
        int i = ++k;
        int j = k--;
        int K = k;

    // PRINT DOS RESULTADOS
        System.out.println("i: " + i + " (prefixado)");
        System.out.println("j: " + j + " (pos-fixado)");
        System.out.println("k: " + K + " (simples)");
    }

    private static void aritmetico(){
    // VARIÁVEIS DECLARADAS:
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

    // OPERAÇÕES E RESULTADOS:
        int r1 = a + b;
        int r2 = c - a;
        int r3 = d * b;
        int r4 = e / a;
        int r5 = c % b;

    // IMPRIME NA TELA OS RESULTADOS
        System.out.println("Valores: \na = 10 | b = 20 | c = 30 | d = 40 | e = 50");
        System.out.println();
        System.out.println("a+b = " + r1);
        System.out.println("c-a = " + r2);
        System.out.println("d*b = " + r3);
        System.out.println("e/a = " + r4);
        System.out.println("c%b = " + r5);
    }

    private static void atribuicao(){
    // VARIÁVEIS DECLARADAS:
        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

    // OPERAÇÕES E RESULTADOS
        i += 5;     // i = i + 5
        j -= 3;     // j = j - 3
        d /= 2.7d;  // d = d / 2.7d
        l *= 3;     // l = l * 3
        k %= 2;     // k = k % 2

    // PRINT NA TELA OS RESULTADOS
        System.out.println("d: " + d);
        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("d: " + d);
        System.out.println("l: " + l);
        System.out.println("k: " + k);

    // k recebe j e i recebe k + print o resultado da atribuição na tela
        i = k = j;
        System.out.println("k: " + k);
        System.out.println("i: " + i);
    }

    private static void precedencia(){
    // VARIÁVEIS DECLARADAS
        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k;   // 10 + 19 * 30  |» 10 + 570 (após o fim da execução o valor de i será acrescentado mais um) |»  resultado final: [581]
        System.out.println("i++ + --j * k = " + a);
        System.out.println("i: " + i);

        int b = k / --i % 3 + 1;   //   30 / 10 % 3 + 1   |»   3 % 3 + 1   |»   0 + 1   |»    1
        System.out.println("k / --i % 3 + 1 = " + b);
        System.out.println("i: " + i);

        int c = 2;
        c *= i += 5;
        System.out.println("c *= i += 5 = " + c);

    }




}
