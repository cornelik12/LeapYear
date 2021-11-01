# Har samarbeidet med Ingvild Louise Eide. 

# Dette har vi gjort: 
# Endret build.gradle-filen: la til testLogging{events "passed", "skipped", "failed", "standardOut", "standardError"}
# Lastet opp prosjektet som et git-repository 
# Satt opp en GitHub workflow 

# Resultat: 
# Loggen til kjøringen i Github Actions viser at testene fra oblig2 blir kjørt og at de passerer som forventet

# PS: oblig2 skrev jeg opprinnelig i Maven. Jeg fikk til en fungerende GitHub workflow, men fant ikke ut hvordan jeg kunne vise frem testene under 'Build with Maven'. 
# Jeg endret derfor oblig2 til å være et Gradle-prosjekt. 
