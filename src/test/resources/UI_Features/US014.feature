@us014

Feature: US014
  Scenario: Doktor ID, start and end dates, description, created date
  appointment id, status, room and patient bilgilerini goruntuluyebilmeli ve guncelenebilmeli
    Given Medunna ana sayfasina gider
    And Sign in secenegini secer
    And kullanici adini ve sifresini girer
    And Sign in butonuna tiklar
    And Items&titles butonuna tiklar
    And Appointments butonuna tiklar
    And View butonuna tiklar
    Then istenilen bilgilerin goruntulendigini kontrol eder
    And Edit butonuna tiklar
    Then istenilen bilgilerin guncellenebildigini kontrol eder
    And tarayiciyi kapatir

  Scenario: Status" doktor tarafindan UNAPPROVED, DISCHARGED, STILL STAYING veya CANCELLED olarak guncellenebilmeli
    Given Medunna ana sayfasina gider
    And Sign in secenegini secer
    And kullanici adini ve sifresini girer
    And Sign in butonuna tiklar
    And Items&titles butonuna tiklar
    And Appointments butonuna tiklar
    And Edit butonuna tiklar
    Then Status un guncellenebildigini kontrol eder
    And tarayiciyi kapatir.




