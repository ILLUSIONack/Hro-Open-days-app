package project.pb.study;

import java.util.Date;

public enum StudyData implements StudyListener {

    VOLTIJD_INFORMATICA() {
        @Override
        public String getName() {
            return "Informatica";
        }

        @Override
        public String[] getGeneralInformation() {
            return new String[] {
                    "We leiden je op tot software engineer. Je gaat aan de slag met het ontwikkelen van software voor diverse toepassingen. Je bent in staat complexe ICT-systemen te analyseren, ontwerpen en implementeren.",
                    "          ",
                    "Software is overal om ons heen te vinden. Jij bent de specialist in het maken van grote en complexe software informatiesystemen die snel, efficiënt en veilig werken. Zo kun je denken aan het ontwikkelen van een functionele app, maar ook aan het analyseren van grote hoeveelheden data van social media. Bij het ontwikkelen van deze systemen kom je in aanraking met verschillende programmeertalen. Zo leer je in het eerste jaar programmeren in Python en geavanceerde programmeertalen zoals Java/C#. Vanaf het tweede jaar kies je zelf welke programmeertaal je wilt gebruiken. Naast het programmeren en ontwikkelen van verschillende toepassingen leer je ook samenwerken.",
                    "          ",
                    "Na het volgen van de opleiding Informatica ben je breed inzetbaar binnen het vakgebied. Vanuit functies als data engineer, software developer en software engineer kun je verder groeien binnen de ICT.",
                    "          ",
                    "Ben jij geïnteresseerd in nieuwe technologische ontwikkelingen, nieuwsgierig, een beetje eigenzinnig en een doorzetter, dan is de opleiding Informatica iets voor jou!"
            };
        }

        @Override
        public String[] getOpenDayInformation() {
            return new String[] {
                    "Klassikale voorlichting",
                    "          ",
                    "Docenten en/of studenten geven een korte voorlichting over de opleiding in een lokaal. De voorlichting duurt ca. 45 minuten.",
                    "          ",
                    "16:45",
                    "17:30",
                    "18:15",
                    "18:45",
                    "          ",
                    "Voorbeelden van projecten",
                    "          ",
                    "Studenten Informatica hebben het studielandschap op de 4e etage ingericht met voorbeelden van hun projecten en vertellen je hier graag iets over.",
                    "16.00 - 20.00 uur doorlopend",
                    "          ",
                    "Workshops",
                    "          ",
                    "Je kunt een workshop volgen. Je ervaart dan zelf wat je onder andere leert tijdens de opleiding.",
                    "          ",
                    "16.00 - 20.00 uur doorlopend"


            };
        }

        @Override
        public String[] getOpenDaysDates() {
            return new String[] {
                    new String("2019-04-4")
            };
        }
    },
    VOLTIJD_TECHNISE() {
        @Override
        public String getName() {
            return "Technise Informatica";
        }

        @Override
        public String[] getGeneralInformation() {
            return new String[] {
                    "Als technisch informaticus werk je aan moderne ICT-systemen waarbij hard- en software geïntegreerd zijn. Dankzij je kennis van programmeren en hardware kun je juist op het snijpunt daarvan opereren.",
                    "          ",
                    "In het dagelijks leven zijn we steeds meer afhankelijk geworden van ICT-systemen. Reizen in het OV kan alleen nog met de OV-chipkaart, je bagage komt op Schiphol automatisch op de juiste plek, energiemeters worden ‘slim’ en medische ingrepen worden soms door een apparaat in plaats van een chirurg gedaan. Allemaal voorbeelden waarbij hard- en software samenkomen in een enkel systeem.",
                    "          ",
                    "Als technisch informaticus draag je bij aan het ontwikkelen, beveiligen en in de lucht houden van deze systemen. Gedurende de studie maak je kennis met de technische aspecten van ICT. Je leert te programmeren in diverse programmeertalen, waaronder de zogenaamde 'lagere' talen voor hardware toepassingen. Hiermee leer je oplossingen ontwikkelen voor verschillende apparaten, robots en andere moderne systemen. Je bent een all-rounder op alle disciplines, maar specialiseert je ook in een of meerdere aspecten in het werkveld. Denk daarbij aan Machine Learning, Augmented Reality, Automated Systems en uiteraard de met IoT (Internet of Things) nauw verbonden met Embedded Systems."
            };
        }

        @Override
        public String[] getOpenDayInformation() {
            return new String[] {
                    "Klassikale voorlichting",
                    "          ",
                    "Docenten en/of studenten geven een korte voorlichting over de opleiding in een lokaal. De voorlichting duurt ca. 45 minuten.",
                    "          ",
                    "16:45",
                    "17:30",
                    "18:15",
                    "18:45",
                    "          ",
                    "Voorbeelden van projecten",
                    "          ",
                    "Studenten Informatica hebben het studielandschap op de 4e etage ingericht met voorbeelden van hun projecten en vertellen je hier graag iets over.",
                    "16.00 - 20.00 uur doorlopend",
                    "          ",
                    "Workshops",
                    "          ",
                    "Je kunt een workshop volgen. Je ervaart dan zelf wat je onder andere leert tijdens de opleiding.",
                    "          ",
                    "16.00 - 20.00 uur doorlopend"

            };
        }

        @Override
        public String[] getOpenDaysDates() {
            return new String[] {
                    new String("2019-04-4")
            };
        }
    }, VOLTIJD_COMMUNICATIE() {
        @Override
        public String getName() {
            return "Technise Informatica";
        }

        @Override
        public String[] getGeneralInformation() {
            return new String[] {
                    "Heb je een scherp oog en oor voor de verhalen van mensen en merken? Ben je creatief met tekst en beeld en gefascineerd door de wereld van media? Dan is de opleiding Communicatie iets voor jou!",
                    "          ",
                    "Organisaties staan voor grote uitdagingen. Een nieuw product promoten, samenwerken met klanten, medewerkers en inwoners, laten zien dat je goede dingen doet voor de samenleving. Hoe doe je dat in een tijd van kritische journalisten, vloggers, maatschappelijke discussies en elkaar snel opvolgende trends?",
                    "          ",
                    "Onze opleiding Communicatie leidt jou in vier jaar op tot wat we - met trots - een smart connector noemen. Een professional die voor slimme verbindingen zorgt. Met inzet van bijvoorbeeld social tools, storytelling, big data en co-creatie. Je ontwikkelt creatieve concepten zoals mediacampagnes, events en verhalenplatforms. Op basis van goed onderzoek, theorie en strategie en natuurlijk jouw eigen verrassende ideeën.",
                    "          ",
                    "Vanaf jaar 1 werk je samen met opdrachtgevers uit de praktijk. Van Rotterdamse ondernemers, start-ups en bureaus tot landelijke organisaties. We werken met innovatieve methodes. In teamverband is dat bijvoorbeeld de scrum methodiek: waarbij je fl exibel en intensief samenwerkt met een opdrachtgever. Geen les, cursus of project is hetzelfde. We stemmen de werkvorm af op wat je leert: webinars, TED Talks, content cafés, meet-ups, gastcolleges en bedrijfsbezoeken.",
                    "          ",
                    "De opleiding Communicatie leert je om als smart connector mensen te raken, te verbinden en te bewegen."
            };
        }

        @Override
        public String[] getOpenDayInformation() {
            return new String[] {
                    "Klassikale voorlichting",
                    "          ",
                    "Docenten en/of studenten geven een korte voorlichting over de opleiding in een lokaal. De voorlichting duurt ca. 45 minuten.",
                    "          ",
                    "16:45",
                    "17:30",
                    "18:15",
                    "18:45",
                    "          ",
                    "Voorbeelden van projecten",
                    "          ",
                    "Studenten Informatica hebben het studielandschap op de 4e etage ingericht met voorbeelden van hun projecten en vertellen je hier graag iets over.",
                    "16.00 - 20.00 uur doorlopend",
                    "          ",
                    "Workshops",
                    "          ",
                    "Je kunt een workshop volgen. Je ervaart dan zelf wat je onder andere leert tijdens de opleiding.",
                    "          ",
                    "16.00 - 20.00 uur doorlopend"

            };
        }

        @Override
        public String[] getOpenDaysDates() {
            return new String[] {
                    new String("2019-04-4")
            };
        }
    }, VOLTIJD_COMMUNICATIE_MEDIA() {
        @Override
        public String getName() {
            return "Technise Informatica";
        }

        @Override
        public String[] getGeneralInformation() {
            return new String[] {
                    "Als CMD’er ontwerp je interactieve producten en diensten. Dat doe je met een creatief team voor échte opdrachtgevers in Studio’s en Labs.",
                    "          ",
                    "De Rotterdamse opleiding Communication and Multimedia Design is mensgericht. Dat betekent dat tijdens het ontwerpproces van bijvoorbeeld webapplicaties, informatiezuilen en interactieve installaties de gebruiker voortdurend centraal staat. Voordat je begint met een ontwerp doe je uitgebreid onderzoek naar de gebruikersbehoeften en naar de omgeving waarin jouw interactieve ontwerp wordt toegepast. Tijdens het ontwikkelproces controleer je voortdurend of je voor je gebruiker ontwerpt. Ontwerpen is immers: testen, falen, herontwerpen, testen, bijstellen etc. Naast nieuwsgierigheid en creativiteit, moet je als CMD’er dus een flinke portie doorzettings- en incasseringsvermogen hebben.",
                    "          ",
                    "In Studio’s en Labs werk je aan échte opdrachten. Onderdeel van het ontwerpproces is het bouwen van een prototype. Zo werkten eerstejaars aan de vraag hoe Lowlands de bezoekers van het festival gedurende het gehele jaar betrokken kon houden. De opleiding CMD daagt je uit jouw kennis, creativiteit en ontwerptalent in te zetten voor interactieve producten en diensten, die het leven en de omgeving van gebruikers veraangenamen of zelfs flink kunnen verbeteren."
            };
        }

        @Override
        public String[] getOpenDayInformation() {
            return new String[] {
                    "Klassikale voorlichting",
                    "          ",
                    "Docenten en/of studenten geven een korte voorlichting over de opleiding in een lokaal. De voorlichting duurt ca. 45 minuten.",
                    "          ",
                    "16:45",
                    "17:30",
                    "18:15",
                    "18:45",
                    "          ",
                    "Voorbeelden van projecten",
                    "          ",
                    "Studenten Informatica hebben het studielandschap op de 4e etage ingericht met voorbeelden van hun projecten en vertellen je hier graag iets over.",
                    "16.00 - 20.00 uur doorlopend",
                    "          ",
                    "Workshops",
                    "          ",
                    "Je kunt een workshop volgen. Je ervaart dan zelf wat je onder andere leert tijdens de opleiding.",
                    "          ",
                    "16.00 - 20.00 uur doorlopend"

            };
        }

        @Override
        public String[] getOpenDaysDates() {
            return new String[] {
                    new String("2019-04-4")

            };
        }
    }, DEELTIJD_INFORMATICA() {
        @Override
        public String getName() {
            return "Technise Informatica";
        }

        @Override
        public String[] getGeneralInformation() {
            return new String[] {
                    "Ben jij toe aan de volgende stap in je loopbaan waarbij je je onder andere bezig houdt met softwaresystemen, informatiesystemen of telematicatoepassingen?",
                    "          ",
                    "ICT is overal om ons heen te vinden. Jij bent als informaticus de specialist in het maken van grote en complexe informatiesystemen die snel, efficiënt en veilig werken. Dit varieert van webshops en apps tot big data analyses van social media. Bij het ontwikkelen van deze systemen kom je in aanraking met verschillende programmeertalen als: JavaScript, HTML5, CSS3, Java (Object georiënteerd programmeren), vanaf het tweede jaar is hierin meer variatie. Naast het programmeren en ontwikkelen van verschillende toepassingen leer je ook samenwerken met medestudenten of met studenten van andere opleidingen.",
                    "          ",
                    "De deeltijdopleiding Informatica is bedoeld voor mensen die toe zijn aan een volgende stap in hun loopbaan. Tijdens je studie is er aandacht voor je persoonlijke en beroepsontwikkeling. Je krijgt de hulp en begeleiding waaraan je zelf behoefte hebt; zo geef je zelf sturing aan je eigen studieloopbaan en beroepscarrière. Ben jij nieuwsgierig, een puzzelaar, een beetje eigenzinnig, een doorzetter, geïnteresseerd in nieuwe mogelijkheden en/of toepassingen en werk je graag met en voor mensen? Dan is Informatica iets voor jou!",
            };
        }

        @Override
        public String[] getOpenDayInformation() {
            return new String[] {
                    "Klassikale voorlichting",
                    "          ",
                    "Docenten en/of studenten geven een korte voorlichting over de opleiding in een lokaal. De voorlichting duurt ca. 45 minuten.",
                    "          ",
                    "16:45",
                    "17:30",
                    "18:15",
                    "18:45",
                    "          ",
                    "Voorbeelden van projecten",
                    "          ",
                    "Studenten Informatica hebben het studielandschap op de 4e etage ingericht met voorbeelden van hun projecten en vertellen je hier graag iets over.",
                    "16.00 - 20.00 uur doorlopend",
                    "          ",
                    "Workshops",
                    "          ",
                    "Je kunt een workshop volgen. Je ervaart dan zelf wat je onder andere leert tijdens de opleiding.",
                    "          ",
                    "16.00 - 20.00 uur doorlopend"

            };
        }

        @Override
        public String[] getOpenDaysDates() {
            return new String[] {
                    new String("2019-04-12"),
                    new String("2019-06-4")
            };
        }
    }, DEELTIJD_COMMUNICATIE() {
        @Override
        public String getName() {
            return "Technise Informatica";
        }

        @Override
        public String[] getGeneralInformation() {
            return new String[] {
                    "Je wilt vanuit je huidige functie als marketingmedewerker of communicatieadviseur graag doorgroeien naar een managementfunctie, maar daarvoor wordt wel een bachelordiploma gevraagd.",
                    "          ",
                    "Het is ook mogelijk dat je al een hbo-opleiding achter de rug hebt, maar dat je van beroep wilt veranderen of  je hebt eerder een economische hbo-opleiding niet afgemaakt en wilt nu toch het bijbehorende diploma - én de carrièreperspectieven - verwerven.",
                    "          ",
                    "Een deeltijdopleiding van Hogeschool Rotterdam is in al die gevallen een efficiënte weg naar het diploma. Bij Hogeschool Rotterdam is de deeltijdopleiding Communicatie verdeeld in twee overzichtelijke periodes van twee jaar, die je beide afsluit met een volwaardig diploma:",
                    "          ",
                    "1:de deeltijd Associate degree Crossmediale Communicatie (jaar 1 en 2)",
                    "en 2:de deeltijd bachelor Communicatie (jaar 3 en 4)",
                    "          ",
                    "De opleiding Communicatie is innovatief en praktijkgericht en leidt je op tot ‘smart connector’. Een smart connector is een professional die mensen slim met elkaar verbindt met de inzet van bijvoorbeeld social tools, big data en co-creatie.",
                    "          ",
                    "De opleiding biedt je alle ‘tools’ om als ‘smart connector’ mensen te kunnen raken, verbinden en bewegen. Op het goede moment, via het juiste communicatiemiddel en met inzet van nieuwe technologie!"
            };
        }

        @Override
        public String[] getOpenDayInformation() {
            return new String[] {
                    "Klassikale voorlichting",
                    "          ",
                    "Docenten en/of studenten geven een korte voorlichting over de opleiding in een lokaal. De voorlichting duurt ca. 45 minuten.",
                    "          ",
                    "          ",
                    "Voorbeelden van projecten",
                    "          ",
                    "Studenten Informatica hebben het studielandschap op de 4e etage ingericht met voorbeelden van hun projecten en vertellen je hier graag iets over.",
                    "16.00 - 20.00 uur doorlopend",
                    "          ",
                    "Workshops",
                    "          ",
                    "Je kunt een workshop volgen. Je ervaart dan zelf wat je onder andere leert tijdens de opleiding.",
                    "          ",
                    "16.00 - 20.00 uur doorlopend"

            };
        }

        @Override
        public String[] getOpenDaysDates() {
            return new String[] {
                    new String("2019-04-12"),
                    new String("2019-06-4")
            };
        }
    }
}
