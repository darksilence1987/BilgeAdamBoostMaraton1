public class Aritmetik {
    public static int Topla(int... sayilar)
    {
        int toplam = 0;
        for(int i : sayilar)
        {
            toplam += i;
        }
        return toplam;
    }
    public static int Carp(int... sayilar)
    {
        int carpim = 1;
        for(int i : sayilar)
        {
            carpim *= i;
        }
        return carpim;
    }
    public static int Cikar(int anaSayi, int cikarilacakSayi)
    {
        return (anaSayi - cikarilacakSayi);
    }
    public static int Bol(int anaSayi, int bolen)
    {
        return (anaSayi/bolen);
    }
    public static int UcgenAlani(int yukseklik, int taban)
    {
        return (taban * yukseklik /2);
    }
    public static int DortgenAlani(int uzunkenar, int kisakenar)
    {
        return (uzunkenar * kisakenar);
    }
}
