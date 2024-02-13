package com.free.myapplication.Odev2

class Odev2 {

    fun aciHesapla(kenarSayisi:Int): Int{
        return ((kenarSayisi-2)*180)/kenarSayisi
    }

    fun maasHesapla(gunSayisi: Int): Int{
        val saat = gunSayisi*8
        if (saat <= 150){
            return saat*40
        } else {
            return ((saat-150)*80)+(150*40)
        }
    }

    fun otoparkSuresi(saat: Int): Int{
        if (saat == 1){
            return 50
        } else {
            return ((saat-1)*10) + 50
        }
    }

    fun kmToMile(km: Double): Double{
        return km * 0.621
    }

    fun dikdortgenAlaniHesapla(birinciKenar: Double, ikinciKenar: Double): Double{
        return birinciKenar*ikinciKenar
    }

    fun faktoriyelHesapla(sayi: Int): Int{
        var i = sayi
        var sonuc = 1
        while (i > 1){
            sonuc *= i
            i--
        }
        return sonuc
    }

    fun harfBul(kelime: String): Int{
        var sayac = 0
        for (harf in kelime) {
            if (harf == 'e') {
                sayac++
            }
        }
        return sayac
    }
}