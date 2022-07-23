@us002

Feature: US002
  Scenario:Herhangi bir karakter iceren ve bos birakilamayan gecerli bir "Username" olmalidir
    Given Medunna ana sayfasina gider
    And ana sayfa giris ikonuna tiklar
    And Register butonuna tiklar
    And username kutusuna uygun username girer
    Then hata mesajinin cikmadigini test eder.
    #And tarayiciyi kapatir.

  Scenario: Email adresinde "@" ve"." olmali, kutu bos birakilmamalidir.
    Given Medunna ana sayfasina gider
    And ana sayfa giris ikonuna tiklar
    And Register butonuna tiklar
    And Email kutusuna uygun Email adresi girer
    Then Email adresi hata mesaji cikmadigini test eder
    #And tarayiciyi kapatir.


