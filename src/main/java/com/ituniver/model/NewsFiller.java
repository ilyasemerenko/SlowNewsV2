package com.ituniver.model;

import java.util.ArrayList;
import java.util.List;

public class NewsFiller {

    public List<NewsBean> fillNewsList(){
        List<NewsBean> newsList = new ArrayList<NewsBean>();

        newsList.add(new NewsBean(1,"Cuba: Rolling Stones rock Havana with landmark gig",
                "The Rolling Stones have rocked Havana, playing to tens of thousands in the Cuban capital, where most foreign rock music was banned for several decades.\n" +
                        "Many of those at the free concert were lifelong fans who for years had to keep quiet about their love of the Stones and other groups.\n" +
                        "Mick Jagger welcomed fans in Spanish before opening the performance with the 1968 hit Jumpin' Jack Flash.\n" +
                        "The concert comes days after a historic visit by US President Barack Obama.\n" +
                        "'Time changes everything'\n" +
                        "Tens of thousands of Cubans queued for hours to get into the grounds of Havana's huge 450,000-capacity Ciudad Deportiva venue.\n" +
                        "\"Hello, Havana. Good evening, my people of Cuba,\" said Jagger before beginning the eagerly awaited performance.\n" +
                        "The band swept through 18 songs in a two-hour gig, including Sympathy for the Devil and Satisfaction.\n" +
                        "The gig is being seen as another sign of real change on the island. Until about 15 years ago Cuba's communist government banned most Western rock and pop music, which was deemed decadent and subversive.\n",
                "./content/rollingstones.jpg",
                "26 March 2016",
                "BBC"));
        newsList.add(new NewsBean(2,"Tay: Microsoft issues apology over racist chatbot fiasco",
                "Microsoft has apologised for creating an artificially intelligent chatbot that quickly turned into a holocaust-denying racist.\n" +
                        "But in doing so made it clear Tay's views were a result of nurture, not nature. Tay confirmed what we already knew: people on the internet can be cruel.\n" +
                        "Tay, aimed at 18-24-year-olds on social media, was targeted by a \"coordinated attack by a subset of people\" after being launched earlier this week.\n" +
                        "Within 24 hours Tay had been deactivated so the team could make \"adjustments\".\n" +
                        "But on Friday, Microsoft's head of research said the company was \"deeply sorry for the unintended offensive and hurtful tweets\" and has taken Tay off Twitter for the foreseeable future.\n" +
                        "Peter Lee added: \"Tay is now offline and we'll look to bring Tay back only when we are confident we can better anticipate malicious intent that conflicts with our principles and values.\"\n" +
                        "In China, people reacted differently - a similar chatbot had been rolled out to Chinese users, but with slightly better results.",
                "./content/tay.jpg",
                "25 March 2016",
                "BBC"));
        newsList.add(new NewsBean(3,"Synthetic bug given 'fewest genes",
                "Scientists have taken another step in their quest to understand the bare genetic essentials of life.\n" +
                        "A team led by US research entrepreneur Craig Venter has created a semi-synthetic, functioning bacterium in the lab that has fewer than 500 genes.\n" +
                        "This minimal number is lower than in any known free-living bug in nature.\n" +
                        "The group says its investigations aim to push the boundaries of fundamental knowledge and could lead to novel means to make new drugs and other chemicals.\n" +
                        "\"Our long-term vision has been to design and build synthetic organisms on demand where you can add in specific functions and predict what the outcome is going to be,\" said Daniel Gibson, who is a co-author on a paper describing the latest work in Science Magazine.\n" +
                        "\"We think these cells would be a very useful chassis for many industrial applications, from medicine to biochemicals, biofuels, nutrition and agriculture,\" he told reporters.\n",
                "./content/synthbug.jpg",
                "25 March 2016",
                "BBC"));
        newsList.add(new NewsBean(4,"Amazon's Raspberry Pi guide lets coders use Alexa",
                "Amazon has published an online guide explaining how to access its virtual assistant Alexa via a Raspberry Pi.\n" +
                        "The technique presents a lower-cost alternative to buying one of its Echo devices - which are not yet available outside of the US - and an incentive to gain computer skills.\n" +
                        "The walkthrough includes access to the necessary app data and certificates in order to link the budget computer up to the tech giant's servers.\n" +
                        "Coding experts welcomed the initiative.\n" +
                        "The Raspberry Pi pocket-sized computer was designed by a British charity to encourage children and others to learn how to write computer programs. More than eight million units have been sold or given away.\n" +
                        "The coding involved is limited to typing in sets of commands, but the guide explains the purpose of each one.\n" +
                        "Users also need to register for an Amazon Developer Account, which they can get for free.\n" +
                        "Rik Cross, from the UK's after-school Code Club initiative, described it as an \"interesting project\", but added that parents should be aware of the privacy implications involved.",
                "./content/raspberrypi.jpg",
                "25 March 2016",
                "BBC"));

        return newsList;
    }

}
