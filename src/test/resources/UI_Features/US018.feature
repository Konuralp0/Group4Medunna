@us018

Feature: Admin olarak Yeni Physicians Olustur  Guncelle  Goruntule ve Sil
  Background: Admin olarak giris yapilir
    Given Medunna ana sayfasina gider
    And ana sayfa giris ikonuna tiklar
    And Sign in secenegini secer
    And kullanici adini ve sifresini girer
    Then Sign in butonuna tiklar




  Scenario: Admin SSN ID ye gore kayitli bir kisiyi arayabilir
    Given Items&titles butonuna tiklar
    And Physicians menusune giris yapar
    And Create a new Physician butonuna tiklar
    And Use Search kutusunu isaretle
    And Istenilen kisinin SSN kimligini girer
    And Search User butonuna tiklar
    Then Verilerin goruntulendigini kontrol eder
    And tarayiciyi kapatir

  Scenario: Doktor bilgilerinde adi soyadi dogum tarihi vb olmalidir
    Given Items&titles butonuna tiklar
    And Physicians menusune giris yapar
    And Create a new Physician butonuna tiklar
    And Use Search kutusunu isaretle
    And Istenilen kisinin SSN kimligini girer
    And Search User butonuna tiklar
    Then adi soyadi dogum tarihi vb bilgilerinin oldugunu test eder
    And tarayiciyi kapatir

  Scenario: Admin doktor uzmanligi muayene ucreti girebilmelidir
    Given Physicians menusune giris yapar
    And Create a new Physician butonuna tiklar
    And Speciality menusune tiklar ve bir uzmanlik dali secer
    Then secimi kontrol eder
    And Exam fee ye tiklar
    And Muayene ucreti verisi girer
    Then Girildiginin kontrolunu yapar
    And tarayiciyi kapatir


  Scenario: Admin doktor fotografi yukleyebilmelidir
    And Physicians menusune giris yapar
    Given Create a new Physician butonuna tiklar
    And choose file butonuna tiklar
    Then resim secim kladorunun acildigini test eder


  Scenario: Admin mevcut kullanicilar arasindan doktoru secebilmelidir
    And Physicians menusune giris yapar
    Given Create a new Physician butonuna tiklar
    And user menusune gider
    And doktor secimi yapar
    Then secimin kontrolunu yapar


  Scenario:  Admin tum doktorlari goruntuleyebilir
    Given Admin olaral giris yapilir
    And Physicians menusune giris yapar


  Scenario:  Admin mevcut doktorlarin bilgilerini guncelleyebilir
    Given Admin olaral giris yapilir
    And Physicians menusune giris yapar

  Scenario: Admin girilmis doktorlari silebilir
    Given Admin olaral giris yapilir
    And Physicians menusune giris yapar






