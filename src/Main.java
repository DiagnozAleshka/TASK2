public class Main {
    public static void main(String[] args) {
int x = 150;
int a = 91;
if (a>1000){
    int b = a/100;
    int c = x + a +b;
    System.out.println(("клиент пополнил счёт на ")+ a + (" рублей, ") + ("бонус равен " )+ b + (" рублей,") + ("Итоговая сумма пополнения равна ") + c + (" рублей"));

} else {
    int d = x + a;
    System.out.println(("клиент пополнил счёт на ")+ a + (" рублей, ") + ("бонус равен 0 рублей " ) + ("Итоговая сумма пополнения равна ") + d + (" рублей"));

}

    }
}