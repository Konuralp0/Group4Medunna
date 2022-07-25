@us010

Feature: US010
  Scenario: Kullanici, randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden görebilmeli
  ve "patient id, start date, end date, status" bilgilerini barindirmali
    Given Medunna ana sayfasina gider
    And Sign in butonuna tiklar
    And kullanici adini ve sifresini girer
    And Sign in butonuna tiklar
    And Items&titles butonuna tiklar
    And Appointments butonuna tiklar
    Then randevu listesi ve zaman dilimleri oldugunu kontrol eder
    Then patient id, start date, end date ve status bilgileri oldugunu kontrol eder
    And tarayiciyi kapatir

