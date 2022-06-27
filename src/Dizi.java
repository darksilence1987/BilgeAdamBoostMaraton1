public class Dizi {
    private int[] dizi;

    public Dizi(){
        dizi = new int[0];
    }
    public Dizi(int[] dizi)
    {
        this.dizi = dizi;
    }
    public void Ekle(int sayi){
        int[] yeniDizi = new int[dizi.length+1];
        for(int i = 0; i < dizi.length; i++)
        {
            yeniDizi[i] = dizi[i];
            yeniDizi[dizi.length] = sayi;
        }
        dizi = yeniDizi;
    }
    public void Sil(int indeks)
    {
        int[] yeniDizi = new int[dizi.length-1];
        for(int i = 0; i < indeks; i++)
        {
            yeniDizi[i] = dizi[i];
        }
        if(indeks < dizi.length-1)
        {
            for(int i = indeks; i < yeniDizi.length; i++ )
            {
                yeniDizi[i] = dizi[i+1];
            }
        }
        dizi = yeniDizi;
    }
    public void ArayaEkle(int sayi, int indeks)
    {
        int[] yeniDizi = new int[dizi.length+1];
        for(int i = 0; i < indeks; i++)
        {
            yeniDizi[i] = dizi[i];
        }
        yeniDizi[indeks] = sayi;
        for(int i = indeks; i < dizi.length; i++)
        {
            yeniDizi[i+1] = dizi[i];
        }
        dizi = yeniDizi;
    }
    public int[] Listele()
    {
        return dizi;
    }
}
