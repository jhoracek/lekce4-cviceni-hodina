# Cvičení: Firemní vozidla a cesty

Vytvoř si nový projekt.

## Zadání

- Chceme evidovat firemní automobily a&nbsp;jízdy s&nbsp;nimi.
- U&nbsp;vozidel evidujeme značku, typ, registrační značku, počet míst, výkon, typ paliva a&nbsp;datum další technický kontroly.
- Chceme umět vypsat, která vozidla je v&nbsp;následujících 30&nbsp;dnech potřeba poslat na technickou prohlídku.
- U&nbsp;každé jízdy evidujeme cíl, počet osob ve vozidle, ujetou vzdálenost, spotřebované palivo (z&nbsp;palubního počítače), datum a&nbsp;použité vozidlo.
- Chceme umět zjistit náklady na osobu (spočtenou ze spotřebovaného paliva podle počtu osob ve vozidle — amortizaci nepočítáme) a&nbsp;celkovou ujetou vzdálenost za zadaný počet dní do minulosti (například za posledních 30 dnů).


## 1. část: Třídy, objekty, kolekce

1. Zkus nyní vytvořit v&nbsp;metodě `main()` tři různá vozidla: 
    - Jedno z nich bude mít 13 dnů před vypršením technické prohlídky, 
    - druhé bude mít technickou prohlídku prošlou. 
    - Třetí bude mít termín další technické kontroly až za rok.

2. Vypiš informace o&nbsp;každém vozidle na obrazovku.

3. Vytvoř třídu pro reprezentaci cest.
    - O&nbsp;každé cestě budeme ukládat vozidlo, které tuto cestu absolvovalo, cíl cesty, datum a&nbsp;délku cesty (počet kilometrů). Uložíme také spotřebované množství paliva.
    - Nezapomeň vytvořit konstruktor a&nbsp;přístupové metody.
    - Vytvoř opět tři instance (objekty) této třídy.
    - Připrav metodu, která vrátí informace o&nbsp;cestě. Můžeme překrýt metodu `toString()`.
    - Vypiš informace o&nbsp;všech cestách.

## 2. část: kolekce

1. Připrav „knihu cest“:
    
    - Budeme v&nbsp;ní evidovat všechny cesty.
    - Počet cest předem neznáme.
    - Další cesty bude možno průběžně přidávat.
    - Připrav metodu, která vrátí celkovou délku všech cest dohromady.

2. Připrav „seznam vozidel“:

    - Uložíme do něj všechna vozidla.
    - Vozidla budou identifikována svou registrační značkou &mdash; vyhledávání vozidla podle registrační značky by mělo být efektivní.

## Rozšíření &mdash; průchod kolekcí

3. Zkus do seznamu vozidel přidat metodu vypisující vozidla, která je třeba poslat na technickou kontrolu:

    - Připrav metodu, která vrátí seznam vozidel, která je třeba poslat na technickou kontrolu.
    - Využiješ tady [průchod kolekcí](kolekce.md#Průchod-všemi-prvky)

## Rozšíření s&nbsp;typem `enum`

Jestli chceš, můžeš si vyzkoušet datový typ `enum`.

3. Přidej k&nbsp;vozidlům informaci o&nbsp;typu paliva &mdash; budeme uvažovat pouze hodnoty: _diesel_, _benzín_, _LPG_, _CNG_ a&nbsp;_elektřina_.

    - Využiješ tady [výčtový typ `enum`](https://github.com/ENGETO-Java-Akademie-2021/content/blob/main/lekce_03/enum.md)