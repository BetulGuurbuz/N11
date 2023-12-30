Feature: Ciceksepeti web sayfasi test
 @KullaniciGirisiHashMap-True-False
  Scenario: HashMap kullanilarak true ve false kullanici girisi denemesi yapilir
    Given Kullanici anasayfadadir
    Given Cookie kabul edilir
    Given Giris yap butonuna tiklar
    When Kullanici adi ve sifresini girer
    Then Tekrar giris yap butonuna tiklar

   @MenudenUrunSepeteEkleme
   Scenario: Menuden urun bulup filtreleme ve siralama yapilarak sepete eklenir
     Given Kullanici anasayfadadir
     Given Cookie kabul edilir
     Given Elektronik menusunden Elektrikli Ev Aletleri secilir
     When Elektrikli Mutfak Aletleri, ardindan Tost makinesi secilir
     When Marka Arcelik secilir
     When Satis miktarina gore siralanir
     Then Ilk urune tiklanir
     Then Urun sepete eklenir
     Then Sepet kontrol edilir