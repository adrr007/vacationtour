package com.rajendra.vacationtourapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rajendra.vacationtourapp.adapter.RecentsAdapter;
import com.rajendra.vacationtourapp.adapter.TopPlacesAdapter;
import com.rajendra.vacationtourapp.model.RecentsData;
import com.rajendra.vacationtourapp.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Now here we will add some dummy data in our model class

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData(
            "Gateway of India",
            "Mumbai",
            "Free",
            "https://www.maharashtratourism.gov.in/gateway-of-india",
            "Gateway of India, the best place to visit in Mumbai, was built in 1924 by George Willet to honor the visit of King George V and Queen Mary to Mumbai. Visit this place in the early morning or late evening hours to enjoy the cool breeze of the sea with your family sans the crowd. Located next to the iconic Taj Mahal Palace and facing the vast Arabian Sea, the Gateway of India leaves you spellbound in every way possible. Take a ferry ride offered here to experience a stupendous view of this monument right from the sea and you can also visit other main attractions nearby. \n" +
                    "Nearby places to eat: \n" +
                    "Chintan Sandwich Corner \n" +
                    "Ohmazing Fast Food \n" +
                    "Olympia Coffee House \n",
            List.of(R.drawable.goi4, R.drawable.goi1, R.drawable.goi2, R.drawable.goi3)
        ));
        recentsDataList.add(new RecentsData(
            "Marine Drive",
            "Mumbai",
            "Free",
            "https://www.maharashtratourism.gov.in/-/girgaon-chowpatty",
            "Marine Drive is a 3 kilometre-long Promenade along the Netaji Subhash Chandra Bose Road in Mumbai, India. The road and promenade were constructed by Pallonji Mistry. At the northern end of Marine Drive is Girgaon Chowpatty and the adjacent road along links Nariman Point at southern tip to Babulnath and Malabar Hill at northern tip. Marine Drive is also known as the Queen's Necklace because, when viewed at night from an elevated point anywhere along the drive, the street lights resemble a string of pearls in a necklace. It is believed that Marine Drive is the pride of the ‘City of Dreams’ and the city is incomplete without this mesmerizing spot.  \n"+
                    "Nearby places to eat: \n" +
                    "Amar’s Pav Bhaji \n" +
                    "Rustom’s Ice cream sandwich \n" +
                    "Jai Jawan Ice Gola \n",
            List.of(R.drawable.md2, R.drawable.md1, R.drawable.md3)
        ));
        recentsDataList.add(new RecentsData(
            "Victoria Memorial",
            "Kolkata",
            "Rs. 30 - Rs. 500",
            "https://www.victoriamemorial-cal.org/visit/index",
            "The Victoria Memorial is a large marble building, which is considered to be the pride of Kolkata. Built between 1906 and 1921, it is dedicated to the memory of Queen Victoria. Now, it is a museum and a popular tourist spot under the Ministry of Culture. Another relic of the British Raj in India, the Victoria Memorial is located in the heart of Kolkata, in West Bengal. This white marbled opulent structure was built in memory of Queen Victoria to celebrate her 25 years of rule over India and is almost a replica of the Victoria Memorial in London. Victoria Memorial is an iconic structure that is synonymous with the city of joy!\n"+
                    "Nearby places to eat: \n" +
                    "Ram Gupta’s Puchka Stall \n" +
                    "No. 1 Chola Batora \n",
            List.of(R.drawable.vm5, R.drawable.vm2, R.drawable.vm3, R.drawable.vm4)
        ));
        recentsDataList.add(new RecentsData(
                "Bandel Basilica",
                "Kolkata",
                "Free",
                "https://bandelbasilica.com/",
                "The Basilica of the Holy Rosary (commonly known as Bandel Church) is one of the oldest Christian churches in West Bengal, India. It is about 2 kms away from the station ‘Bandel’.  The present church and monastery are said to be built in 1660 by Gomez de Soto having the key stone of the old church bearing the date 1599 over the eastern gate of the Monastery. In front of the Church stands a ship’s mast which was presented by the captain of a vessel which had encountered a storm in Bay of Bengal and save by the grace of Virgin, the center of attraction. There is the statue of” One lady of Happy Voyage” in the middle of the church. \n"+
                        "Nearby places to eat: \n" +
                        "Mritunjoy Restaurant \n" +
                        "Ramkrishna Mistanna Prashistan \n" +
                        "Nabani Sweets \n",
                List.of(R.drawable.bb1, R.drawable.bb2, R.drawable.bb3, R.drawable.bb4)
        ));
        recentsDataList.add(new RecentsData(
            "Red Fort",
            "Delhi",
            "Rs. 90 - Rs. 950",
            "https://delhitourism.gov.in/delhitourism/tourist_place/red_fort.jsp",
            "The beautiful Red Fort (Lal Qila) was built by Shah Jahan in 1648 and served as the seat of Mughal power until 1857. This stunning structure, with its tall, red sandstone walls covers an area of more than two square kilometers, the entirety of which is crescent shaped and surrounded by a moat.\n" +
                    "Nearby places to eat: \n" +
                    "Natraj Dahi Bhalla \n" +
                    "Lotan Chole wala \n",
            List.of(R.drawable.rf1, R.drawable.rf2, R.drawable.rf3, R.drawable.rf4)
        ));
        recentsDataList.add(new RecentsData(
            "India Gate",
            "Delhi",
            "Free",
            "https://delhitourism.gov.in/delhitourism/tourist_place/india_gate.jsp",
            "India Gate is a magnificent stone arch built as a memorial to Indian soldiers killed in WWI. An eternal flame burns beneath the massive structure, and its walls are inscribed with the names of more than 90,000 soldiers who died in the conflict. For a real treat, try to see the India Gate at night, considered one of the top free things to do in New Delhi. It's a spectacular sight when it and nearby fountains are floodlit.\n" +
                    "Nearby places to eat: \n" +
                    "Khan Chacha Keema \n" +
                    "Gulati Restaurant \n",
            List.of(R.drawable.ig1, R.drawable.ig2, R.drawable.ig3, R.drawable.ig4)
        ));
        recentsDataList.add(new RecentsData(
            "Vivekananda House",
            "Chennai",
            "Rs. 5 - Rs. 20",
            "https://vivekanandahouse.org/visit-us",
            "Another sightseeing place that you cannot miss on your Chennai tour is the Vivekananda house and Museum, located at Kamaraj Salai on the Marina Beach Road. Initially, built in 1842 to store ice blocks, it was called the Ice House. Later, it was bought by a renowned lawyer, Bilagiri Iyengar, who named it Castle Kernan in the respect of his friend. It now presents an insight into the life of Swami Vivekananda through an exhibition on his life as well as on Indian Culture which is organised all around the year. It is now maintained by the Ramakrishna Math. Visitors can see the bedroom, dining area, kitchen and the garden, which is also known as Vivekananda Park. His teachings can also be learnt at the gallery and the meditation room. \n" +
                    "Nearby places to eat: \n" +
                    "KaraiKudi Chettinadu Restaurant \n" +
                    "Ratna Cafe \n",
            List.of(R.drawable.vh1, R.drawable.vh2, R.drawable.vh3)
        ));
        recentsDataList.add(new RecentsData(
            "Marundeeshwarar Temple",
            "Chennai",
            "Free",
            "https://chennaitourism.travel/marundeeswarar-temple-chennai",
            "Dedicated to Lord Shiva, this temple is located at Lalitha Nagar, Thiruvanmiyur. Temple’s impressive structure in Dravidian style and historical importance is another reason to plan a visit here. Constructed during the Chola Dynasty in the 9th century and then expanded during the reign of Vijayanagar rulers, Marundeeswarar Temple is now maintained by the Govt. of Tamil Nadu. As per the legend, Lord Marundeeswarar had taught the great Sage Agastya about the medicinal importance of various herbs. Hence, many people come here to seek blessings and cure their ailments. The prasad of the temple is also believed to cure illnesses.\n" +
                    "Nearby places to eat: \n" +
                    "Nayak Fishland \n" +
                    "RNS Cafe \n",
            List.of(R.drawable.mt3, R.drawable.mt1, R.drawable.mt2)
        ));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData(
                "Mumbai",
                "Two days itinerary: \n" +
                "Day 1:\n" +
                        "Visit The Gateway of India which is well-known for tourism and photographic activities.If you're a souvenir collector, be ready to have a blast at Colaba Causeway, one of Mumbai's most renowned marketplaces.In the evening head towards Stunning views of the marine drive and have it's famous variety of mouth-watering street cuisine with a unique Mumbai flavor, which is often sweet and sour.\n" +
                        "Nearby places to eat: \n" +
                        "Bademiya \n" +
                        "Delhi Darbar\n" +
                        "Leopold Café & Bar \n" +
                        "Café Mondegar \n" +
                "Day2 :\n" +
                        "On the second day of your journey, wake up early and prepare to visit the city's treasures, beginning with the famed Haji Ali Dargah.Relish a delicious breakfast/brunch in Lower Parel.Explore the best of the best in the Queen of Suburbs.Get your spirits high at Mumbai’s nightclubs\n" +
                        "Nearby places to eat: \n" +
                        "Poetry by Love and Cheesecake \n" +
                        "Smoke House Deli\n" +
                        "Tea Villa Café \n" +
                        "Bombay Dosa Co. \n" +
                "\nFive days itinerary: \n" +
                "Day 1:\n" +
                        "On the First day start with visiting Gateway of India one of the most visited places for tourist.After having breakfast near Gateway of India visit India’s oldest aquarium Taraporewala Aquarium , this place houses a variety of marine and freshwater fishes including coral fishes from the Lakshadweep Islands and have dinner at the street stalls in Chowpatty.\n" +
                "Day 2 :\n" +
                        "Start the day by taking blessings of the Ganesha. One of the most frequented temples in Mumbai, the Siddhivinayak Temple is dedicated to Lord Ganesh. Have breakfast at Cafe Madras. Take your significant other to this amazing Hanging Garden and unwind and slacken yourself amidst the flower beds, spectacular water fountains, and lush green animal shaped hedges. End your day by having Dinner at Pizza by the Bay.\n" +
                "Day 3:\n" +
                        "Enjoy your whole day by visiting Essel world one the best amusement parks in Mumbai for that reach gorai creek and reach by ferry\n" +
                "Day 4:\n" +
                        "Start your day in by visiting Haji Ali Dargah and then visit the Mumbai Darshan Bus by maharashtra tourism and end you day at Girgaon Chowpatty by having variety of  delicious mumbai street food.\n" +
                "Day 5:\n" +
                        "Visit Marine drive in the morning for fresh and breezy air and sunrise followed by breakfast at military cafe at fort and end your trip with amazing experiences.\n",
                "Starting from Rs. 5000",
                "Mumbai, formerly Bombay, city, capital of Maharashtra state, southwestern India. It is the country’s financial and commercial centre and its principal port on the Arabian Sea.",
                R.drawable.goi1));
        topPlacesDataList.add(new TopPlacesData(
                "Delhi",
                "Two days itinerary: \n" +
                        "Day 1:\n" +
                        "Capture the most iconic attractions on the Rajpath. Indulge in gastronomic & cultural delights of Old Delhi. Delve into the Mughal magnificence at Red Fort. Enjoy a shopping spree at Connaught Place. Later relish scrumptious food, party or attend a live gig\n" +
                        "Nearby places to eat: \n" +
                        "Lotan Chole Kulche Wala \n" +
                        "Jung Bahadur Kachori Wala\n" +
                        "Paranthe Wali Gali \n" +
                        "Natraj Dahi Bhalle Wala\n" +
                        "Day 2:\n" +
                        "Visit the centuries-old Qutub Minar Complex. Explore the mystical ruins and quirky cafes of Hauz Khas. Admire the architectural beauty of Lotus Temple. Capture the grand setting of Humayun’s Tomb. Take a stroll around the historical Lodhi Garden. Indulge in street grubs and budget shopping. Later experience the richness of Indian culture at Dilli Haat\n" +
                        "Nearby places to eat: \n" +
                        "Hauz Khas Social \n" +
                        "Yeti – The Himalayan Kitchen \n" +
                        "Coast Café \n" +
                        "Naivedyam \n" +
                        "\nFive days itinerary: \n" +
                        "Day 1:\n" +
                        "Start your trip in the capital by visiting one of the most important addresses in the country, the Rashtrapati Bhavan, the official residence and workplace of the President of India. Before visiting, book your tickets online and read this guide to help you plan better as some sections of Rashtrapati Bhavan remain open only on select days. If you’re here between the months of August and March, make sure you don’t miss the famed Mughal Gardens, known as the soul of the Presidential estate. When you’re done with the tour, head to India Gate, the First World War memorial and one of the most celebrated monuments in Delhi.\n" +
                        "Day 2:\n" +
                        "In the 17th century, the fifth Mughal Emperor Shah Jahan decided to transfer his seat of government from Agra to Delhi. With the Red Fort as the focal point, he gave the orders for the construction of a new city that he named Shahjahanabad. The famous market of Chandni Chowk was the pride of Shahjahanabad back then and today, the place is renowned as one of the busiest markets in Asia selling everything from exotic spices to silver jewelry and handmade perfumes.\n" +
                        "Day 3:\n" +
                        "Delhi is a city that has seen the rise and fall of some of the most powerful empires in India. Each successive dynasty constructed new capitals and historically, there have been seven smaller cities which make up today’s modern Delhi. From the Delhi Sultanate to the Mughals, every empire left behind their own unique legacy in the various monuments they built across the capital. It would almost be sacrilegious to skip these stunning monuments during a trip to Delhi.\n" +
                        "Day 4:\n" +
                        "While you’ll never run out of things to do in the capital, if you’re here for five days, it makes sense to take a quick day trip to Agra to see the beautiful Taj Mahal. The distance between the two cities is approximately 230 kilometers and it takes about four hours to cover this length. If you start early, you’ll easily make it back to Delhi by evening. Also, you’ll escape the crowd at the Taj Mahal if you reach the place before hundreds of tourists start flooding in. Historians believe that this marble mausoleum is the pinnacle of Mughal architecture in India.\n" +
                        "Day 5:\n" +
                        "Spend the final day of your trip by visiting some of Delhi’s leading museums and art galleries. History buffs can head to the National Museum, which houses artifacts right from the ancient Harappan Civilisation. The National Gandhi Museum and the Indira Gandhi Memorial Museum are a couple of other places that shed light on two important historical figures. If you’re more into crafts, the National Handicrafts and Handlooms Museum would be more suited to your taste and those into literature should visit the Ghalib Museum and Library. Delhi also has some offbeat museums like the Sulabh International Museum of Toilets and Shankar’s International Dolls Museum.\n",
                "Starting from Rs. 8000",
                "Delhi, officially the National Capital Territory (NCT) of Delhi, is a city and a union territory of India containing New Delhi, the capital of India.\n",
                R.drawable.del));
        topPlacesDataList.add(new TopPlacesData(
                "Goa",
                "Two days itinerary: \n" +
                        "Day 1:\n" +
                        "Explore the northern part of Goa on the first day and then move to the southern district. Golden beaches, water sports, sizzling nightlife, exquisite architecture, and party hotspots - North Goa is defined by all these and more. The northern district consists of three main spots - Fort Aguada, Calangute Beach, Dona Paula\n" +
                        "Nearby places to eat: \n" +
                        "Tuscany Gardens \n" +
                        "Spice Goa \n" +
                        "Thalassa \n" +
                        "Britto’s Bar and Restaurant \n" +
                        "Day 2:\n" +
                        "The magic of South Goa lies in its tranquility and romantic vibe. Along with the natural attractions, there are many man-made wonders to explore as well. Add to that a fine dose of Portuguese culture and you have a complete package to unravel. For your itinerary of the best places to visit in Goa in 2 days, here’s our pick from South Goa:\n" +
                        "Palolem Beach\n" +
                        "Indian Naval Aviation Museum\n" +
                        "Dudhsagar Waterfalls\n" +
                        "Nearby places to eat: \n" +
                        "Zeebop by the Sea \n" +
                        "The Space Goa \n" +
                        "Martin’s Corner \n" +
                        "\nFive days itinerary: \n" +
                        "Day 1:\n" +
                        "Explore the northern part of Goa on the first and second day and then move to the southern district. Golden beaches, water sports, sizzling nightlife, exquisite architecture, and party hotspots - North Goa is defined by all these and more. The northern district consists of three main spots - Fort Aguada, Calangute Beach, Dona Paula\n" +
                        "\n" +
                        "Day 2:\n" +
                        "Visit Places: \n" +
                        "Mangeshi Temple\n" +
                        "Museum of Christian Art\n" +
                        "Se Cathedral\n" +
                        "\n" +
                        "Day 3:\n" +
                        "Casino Pride\n" +
                        "A few places to shop in Goa are:\n" +
                        "Anjuna flea market, Arpora night market, Mapusa Friday market, Mackie’s Saturday night market, Panjim municipal market, and Calangute market square\n" +
                        "\n" +
                        "Day 4:\n" +
                        "The magic of South Goa lies in its tranquility and romantic vibe. Along with the natural attractions, there are many man-made wonders to explore as well. Add to that a fine dose of Portuguese culture and you have a complete package to unravel. Here’s our pick from South Goa:\n" +
                        "Palolem Beach\n" +
                        "Indian Naval Aviation Museum\n" +
                        "Dudhsagar Waterfalls\n" +
                        "\n" +
                        "Day 5:\n" +
                        "Visit places: \n" +
                        "Colva Beach\n" +
                        "Cabo de Rama Fort\n" +
                        "Mollem National Park\n",
                "Starting from Rs. 7000",
                "Goa is the perfect destination for all kinds of travelers. With sun-kissed beaches, vibrant shacks, trance parties, magnificent churches, glorious forts, lip-smacking seafood, and a fine range of hotels in Goa, the party capital of India promises you days and days of fun and leisure.\n",
                R.drawable.goa));
        topPlacesDataList.add(new TopPlacesData(
                "Kolkata",
                "Two days itinerary: \n" +
                        "Day 1:\n" +
                        "Enjoy a sumptuous breakfast at the famous Flurys at Park Street. Visit Victoria Memorial and other attractions near Maidan. Capture the beauty of Princep Ghat. Head back to Park Street, do some shopping, and enjoy the night vibes of Kolkata\n" +
                        "Nearby places to eat: \n" +
                        "King’s Landing \n" +
                        "Maharaja \n" +
                        "Mocambo \n" +
                        "Hard Rock Café \n" +
                        "Day 2:\n" +
                        "Start the day with a filling breakfast at Terreti Morning Market. Visit the Kalighat Temple. Delve into history at the Indian Museum followed by lunch at a nearby restaurant. Soak in the splendor of colonial-era architecture at BBD Bagh. Spend some relaxing moments at Millennium Park. Visit Howrah Bridge. Do some street shopping in the New Market Area. Enjoy a hearty dinner at a restaurant in Esplanade\n" +
                        "Nearby places to eat: \n" +
                        "SOI-The Asian Street Kitchen \n" +
                        "The Esplanade \n" +
                        "Zaranj \n" +
                        "Blue Sky Café \n" +
                        "\nFive days itinerary: \n" +
                        "Day 1:\n" +
                        "Park Street, Kolkata’s ‘street that never sleeps’ is among the best starting points to jump right into exploring the city without completely overwhelming yourself. The bustling thoroughfare is pedestrian friendly and home to several iconic eateries. Stop by Flury’s, a famous tearoom established in 1927, for tea and biscuits, or for kathi rolls at Kusum Rolls, which has been serving some of the city’s best since 1971. \t\n" +
                        "Day 2:\n" +
                        "Start your second day at New Market, the city’s best-known market. The Indian Museum, located within the same Dharmatala neighbourhood, is among the city’s best-maintained museums for a dose of local, national and global history. The Maidan, the city’s largest public green space, is just around the block and is a prime location to people watch. \n" +
                        "Day 3:\n" +
                        "Kolkata’s Old Chinatown, or Terreti Bazaar, is the only Chinatown of this kind in India. This historic neighbourhood preserves a slice of Kolkata’s unique cultural heritage, that of the local Chinese immigrant community, which at one point was 20,000 strong. Start your day here early, at around 6.30 am, to dig into fresh breakfast street food including momos or dumplings (fried and steamed), sausages, stuffed buns, rolls and chai.\n" +
                        "Day 4:\n" +
                        "Start your day at the Mallick Ghat Flower Market, which is over a century old and considered to be India’s biggest flower market. It also happens to be located right below the Howrah Bridge, one of the world’s busiest bridges and a must-visit Kolkata attraction. Once you’re done soaking in the area, grab a cab and head up to the city’s north, famous for its narrow lanes, heritage mansions and rich history.\n" +
                        "Day 5:\n" +
                        "As India’s unofficial literary capital, Kolkata has much to offer bibliophiles. College Street, a century-old hub of used books in Kolkata, is considered to be the world’s largest book market of its kind. The Indian Coffee House, a historic cafe dating back to the mid-twentieth century, is right around the corner and is a must-visit for a dose of the city’s coffee house culture. This charming spot was once a regular haunt for intellectual figures such as Satyajit Ray, Amartya Sen, Rabindranath Tagore, Subhas Chandra Bose and Sunil Gangopadhyay.\n",
                "Starting from Rs. 7500" ,
                "Nestled on the banks of the Hooghly River, Kolkata is a booming metropolis, India's second largest city, and the country's cultural hub, known for being the birthplace of major artistic and literary movements.",
                R.drawable.download));
        topPlacesDataList.add(new TopPlacesData(
                "Chennai",
                "Two days itinerary: \n" +
                        "Day 1:\n" +
                        "Watch the sunrise at Marina Beach followed by a quintessential South Indian breakfast at Triplicane. Visit Sri Parthasarathy and other iconic religious attractions. Take a tour of the Government Museum followed by lunch. Soak in the history of Fort St. George. Head to Burma Bazaar for some budget shopping followed by an early dinner\n" +
                        "Nearby places to eat: \n" +
                        "Sangeetha Veg Restaurant \n" +
                        "Ananda Bhavan \n" +
                        "Chennai Woodlands \n" +
                        "Hotel National \n" +
                        "Day 2:\n" +
                        "Explore the cultural and culinary delights of Mylapore. The Kapaleeshwarar Temple, Luz Church, Old houses on Mada Street. Witness the architectural beauty of Marundeeswarar Temple. Watch the sunset at Elliot Beach. Shop till you drop at T. Nagar followed by dinner\n" +
                        "Nearby places to eat:" +
                        "3B’s – Buddies, Bar & Barbecue \n" +
                        "Mylai Karpagambal Mess \n" +
                        "Ratna Café \n" +
                        "Nithya Amritam \n" +
                        "\nFive days itinerary: \n" +
                        "Day 1:\n" +
                        "On your first day, visit the world famous Marina Beach along the Bay of Bengal. It is the longest natural urban beach in India and the world's longest beach. Visit the nearby historical White Town Fort St. George and the famous Kapaleeshwarar Temple of Lord Shiva,located in Mylapore.\n" +
                        "Day 2:\n" +
                        "The Parthasarathy Temple is one of the oldest structures in Chennai city and the temple is dedicated to the god Krishna. Day 2 also includes a city tour of Chennai with San Thome Basilica,Vadapalani Andavar Temple and Valluvar Kottam.\n" +
                        "Day 3:\n" +
                        "Start your day early by visiting Madras Crocodile Bank, the first crocodile breeding centre in Asia having mugger crocodile,saltwater crocodile, and gharial. Later on the day visi the Guindy Snake Park and Arignar Anna Zoological Park.\n" +
                        "Day 4:\n" +
                        "After early morning breakfast, drive to Mahabalipuram via East coast road, a 58 km long drive that will take 1 hour 35min. Visit the famous Kanchipuram on the way to Mahabalipuram, Check in to Mahabalipuram hotel and realx for the day at Covelong Beach.(Stay 1 day in Kanchipuram to visit famous temples)\n" +
                        "Day 5:\n" +
                        "Full day sightseeing of Mahabalipuram, Visit the famous Shore Temple of Lord Shiva and other tourist destinations in Mahabalipuram include Arjuna’s Penance, Varaha Cave, Tiger Caves and Mahishasurmardini Cave.\n",
                "Starting from Rs. 8000",
                "Chennai, famous as the biggest cultural and economic center down south exhibits a perfect amalgamation of art, architecture, dance, music and drama. Chennai earlier known as Madras is the capital city of the Indian state of Tamil Nadu.\n",
                R.drawable.che));


        setTopPlacesRecycler(topPlacesDataList);
    }

    private  void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

    }

    private  void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);

    }

}
