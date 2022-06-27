// Method isimleri büyük harfler ile başlamaktadır.
public class TurkceString {
    public String icerik;
    public TurkceString()
    {
        icerik = "";
    }
    public TurkceString(String string)
    {
        icerik = string;
    }
    public char IndekstekiKarakter(int indeks) //1
    {
        return icerik.charAt(indeks);
    }
    public boolean IceriyorMu(String string) //2
    {
        return icerik.contains(string);
    }
    public boolean IceriyorMu(char karakter)
    {
        return icerik.contains(Character.toString(karakter));
    }
    public boolean EsitMi(String string) //3
    {
        return icerik.equals(string);
    }
    public boolean BuyukKucukFarkEtmezEsitMi(String string) //4
    {
        return icerik.equalsIgnoreCase(string);
    }
    public String Degistir(String degisecekKisim, String degistirilecekIfade) //5
    {
        return icerik.replace(degisecekKisim, degistirilecekIfade);
    }
    public int Uzunluk() //6
    {
        return icerik.length();
    }
    public boolean BosMu() //7
    {
        return icerik.isEmpty();
    }
    public int IndeksiNerede(char karakter) //8
    {
        return icerik.indexOf(karakter);
    }
    public int IndeksiNerede(String ifade)
    {
        return icerik.indexOf(ifade);
    }
    public int IndeksiNerede(char karakter, int baslangicIndeksi)
    {
        return icerik.indexOf(karakter, baslangicIndeksi);
    }
    public int IndeksiNerede(String ifade, int baslangicIndeksi)
    {
        return icerik.indexOf(ifade, baslangicIndeksi);
    }
    public String SeciliKisim(int baslangicIndeksi) //9
    {
        return icerik.substring(baslangicIndeksi);
    }
    public String SeciliKisim(int baslangicIndeksi, int bitisIndeksi)
    {
        return icerik.substring(baslangicIndeksi, bitisIndeksi);
    }
    public String KucukKarakterler() //10
    {
        return icerik.toLowerCase();
    }
    public String BuyukKarakterler() //11
    {
        return icerik.toUpperCase();
    }
    public String Kirp() //12
    {
        return icerik.trim();
    }


}
