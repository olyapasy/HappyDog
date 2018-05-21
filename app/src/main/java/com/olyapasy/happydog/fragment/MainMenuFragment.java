package com.olyapasy.happydog.fragment;


import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.olyapasy.happydog.BreedActivity;
import com.olyapasy.happydog.R;
import com.olyapasy.happydog.adapter.BreedAdapter;
import com.olyapasy.happydog.model.Breed;
import com.olyapasy.happydog.model.Category;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainMenuFragment extends Fragment {
    ArrayList<Breed> breeds = new ArrayList<Breed>();
    ArrayList<Breed> breeds2;
    Category category;
    GridView gridView;
    MainMenuFragment mainMenuFragment;


    public MainMenuFragment() {
        // Required empty public constructor
    }


    public GridView getGridView() {
        return gridView;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_main_menu, container, false);
        gridView = (GridView) rootView.findViewById(R.id.mainMenuGrid);
        fillData();
        Bundle bundle = getArguments();
        breeds2 = new ArrayList<>(breeds);
        if (bundle != null) {
            String title = bundle.getString("Title").toLowerCase();
            if (!title.equals("all")){
                for (Breed b : breeds) {
                    if (!b.getType().toLowerCase().equals(title)) {
                        breeds2.remove(b);
                    }
                }

            }
        }
        final BreedAdapter breedAdapter = new BreedAdapter(breeds2, getContext());
        gridView.setAdapter(breedAdapter);
        gridView.setVerticalSpacing(50);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(),BreedActivity.class);
                intent.putExtra("BreedTitle", breeds2.get(i).getTitle());
                intent.putExtra("BreedDescription", breeds2.get(i).getDescription());
                intent.putExtra("BreedImage",breeds2.get(i).getDetailedImage());
                intent.putExtra("BreedColor",breeds2.get(i).getBackground());

                startActivity(intent);

            }
        });
        return rootView;
    }


    void fillData() {
        breeds.add(new Breed("Husky",
                "The Siberian Husky " +
                "(is a medium size working dog that items in the north-eastern Siberia, Russia.) " +
                "It is recognizable by its thickly furred double coat, erect triangular ears," +
                " and distinctive markings.  The original Siberian Huskies were bred by the Chukchi" +
                " people - Which hunter-gatherer culture relied on their help. It is an active," +
                " energetic, resilient breed, whose ancestors lived in the extremely cold" +
                " and harsh environment of the Siberian Arctic. William Goosak, a Russian" +
                " fur trader, introduced them to Nome, Alaska during the Nome Gold Rush," +
                " originally as sled dogs. The people of Nome referred to the Siberian Huskies" +
                " as Siberian Rats due to their size of 40-50 lb " +
                "(18-23 kg), versus the Malamutes size of 75-85 lb (34-39 kg)",
                "Big",
                R.drawable.haski, R.drawable.husky,"#4f8edb"));
        breeds.add(new Breed("Bassethound", "The Basset Hound is " +
                "a short-legged breed of dog of the hound family. The Basset is a" +
                " scent hound that was originally bred for the purpose of hunting" +
                " hare. Their sense of smell and ability to ground-scent is second" +
                " only to that of the Bloodhound. Basset Hounds are one of 6 recognised" +
                " basset-type items in France. The name Basset is derived from" +
                " the French word bas, meaning \"low\", with the attenuating suffix" +
                " -et, together meaning \"rather low\". Basset Hounds are usually" +
                " bicolours or tricolours of standard hound colouration.",
                "Little",
                R.drawable.bassethound, R.drawable.bussethound,"#D4D3D4"));
        breeds.add(new Breed("Bulldog", "A Bulldog is a medium-sized" +
                " breed of dog. Bulldog or British Bulldog. It is a muscular, hefty dog " +
                "with a wrinkled face and a distinctive pushed-in nose. The American Kennel" +
                " Club (AKC), The Kennel Club (UK), and the United Kennel Club (UKC) oversee " +
                "breeding records. The Bulldog Club of America (BCA) maintains the standard" +
                " of excellence for the guidance of breeders, owners and judges in the United " +
                "States. Bulldogs were the fourth most popular purebred in the US in 2016 according to the American Kennel Club.\n" +
                "\n" +
                "Bulldogs have a longstanding association with the" +
                " British culture, as the BBC wrote: to many the Bulldog is a national icon, " +
                "symbolizing pluck and determination. During World War II, the Bulldogs were " +
                "often likened to the Prime Minister Winston Churchill and his defiance of Nazi " +
                "Germany. When the English settled in the Americas, their Bulldogs came with them" +
                ". A few dedicated bulldog fanciers formed the Bulldog Club of America in 1890 " +
                "and it was incorporated under the laws of the State of New York on November 29, 1904.'\n" +
                "        ", "Middle", R.drawable.buldog, R.drawable.bulldog,"#FFE3E0"));
        breeds.add(new Breed("Miniature Schnauzer", "The Miniature" +
                " Schnauzer is a breed of the small dog of the schnauzer that was " +
                "originated in Germany in the mid-to-late 19th century. Miniature" +
                " Schnauzers developed from crosses between the Standard Schnauzer" +
                " and one or more smaller items such as the Poodle and Affenpinscher," +
                " as farmers bred a small dog that was an efficient ratting dog. " +
                "They are described as spunky but aloof dogs, with good guarding " +
                "tendencies without some guard dogs. Predisposition to bite." +
                " Miniature Schnauzers are recognized in three colors internationally:" +
                " solid black, black and silver, and salt and pepper." +
                " There is a controversial fourth color variant in Miniature Schnauzers," +
                " pure white, which is not recognized universally.  " +
                "The breed remains one of the most popular worldwide, " +
                "primarily for its temperament and relatively small size." +
                " As of 2017 it is the 17th most popular breed in the U.S Yoshi is de best!!!1!",
                "Little", R.drawable.mitshnauzer, R.drawable.schnauzer,"#D7E5F7"));
        breeds.add(new Breed("ChowChow", "The Chow Chow (sometimes simply Chow)" +
                "is a dog breed originally from northern China, where it is referred to as" +
                " Songshi Quan (Pinyin: sōngshī quǎn 鬆獅 犬), which means \"puffy-lion dog\"." +
                " The breed has also been called the Tang Quan, \"Dog of the Tang Empire.\" " +
                "It is believed that the Chow Chow is one of the native dogs used for the foo dog, " +
                "the traditional stone guardians found in the front of Buddhist temples and palaces. " +
                "It is one of the few ancient dog items still in existence in the world today.",
                "Middle", R.drawable.chau, R.drawable.chowchow,"#FFFEFF"));
        breeds.add(new Breed("Shih Tzu", "The Shih Tzu is a sturdy" +
                " little dog with a short muzzle and large dark eyes. " +
                "They have a soft and long double coat. A Shih Tzu should stand" +
                " no more than 28 cm (11 in.) At the withers and with an ideal" +
                " weight of 4.5 to 8.5 kg (10 to 19 lbs). Drop ears are covered" +
                " with long fur, and the heavily furred tail is carried. " +
                "The coat may be of any color, although white and with blazes " +
                "of gray are frequently seen. The Shih Tzu is slightly taller" +
                " and taller. A very noticeable feature is the underbite, which" +
                " is required in the breed standard. The traditional long silky coat, " +
                "which reaches the floor, requires daily brushing to avoid tangles." +
                " Because of their long coat and fast-growing hair, regular grooming is necessary," +
                " which may be expensive and should be taken into account when considering " +
                "adopting one of this breed. " +
                "Often the coat is clipped short to simplify care, but the coat still requires" +
                " daily brushing. For conformation, the coat must be left in its natural state," +
                " although trimming for neatness. " +
                "The shorter cut is usually called a \"puppy cut\" or a \"teddy bear cut\" when" +
                " the puppy cuts is accompanied by a fuller, rounder, resembling a stuffed animal.",
                "Little", R.drawable.shtsu, R.drawable.shtsu,"#FEBD64"));
        breeds.add(new Breed("Coonhounds", "\"In the colonial period," +
                " hounds were imported into the United States for the popular sport" +
                " of fox hunting. Various items of foxhounds and other hunting hounds" +
                " were imported from England, Ireland, and France.  Foxhounds were" +
                " found to be inadequate for hunting American animals that did not hide" +
                " near the ground, but instead of climbed trees, such as raccoons," +
                " opossums, bobcats, and even larger prey like cougars and bears." +
                " The dogs were often confused or unable to hold the scent when this" +
                " occurred. This led to the development of tree hounds by hunters and dog breeders." +
                " Foundation dogs were chosen for an animal, and, most importantly," +
                " to follow an animal both on the ground and when it took to a tree." +
                " Bloodhounds specifically were added to many coonhound lines to " +
                "enhance the ability to track.  Coonhounds can hunt individually " +
                "or as a pack. Often, hunters do not chase their quarry along with" +
                " the hounds, unlike organized, foxhunting, but wait and listen to " +
                "the distinctive baying to determine if prey has been treed.",
                "Big", R.drawable.englishrunable, R.drawable.englishrunable,"#0E7ED5"));
        breeds.add(new Breed("German Shepherd", "The German Shepherd " +
                "is a breed of medium to large-sized working dog that originated in Germany." +
                " The breed's officially recognized name is the German Shepherd Dog" +
                " in the English language (sometimes abbreviated as GSD). " +
                "The breed was once known as the Alsatian in Britain and Ireland. " +
                "The German Shepherd is a relatively new breed of dog, with their" +
                " origin dating to 1899. As part of the Herding Group, German Shepherds" +
                " are working dogs developed originally for herding sheep. Since that time, " +
                "however, because of their strength, intelligence, trainability," +
                " and obedience, the German Shepherds around the world are often" +
                " the preferred breed for many types of work, including disability" +
                " assistance, search-and-rescue, police and military roles, and even acting. " +
                "The German Shepherd is the second-most registered breed by the " +
                "American Kennel Club and the seventh-most registered breed by The" +
                " Kennel Club in the United Kingdom.", "Big",
                R.drawable.ovcharka, R.drawable.germanshepherd,"#FEDA96"));
        breeds.add(new Breed("Spaniel", "English Cocker Spaniels are small" +
                " spaniels.  Welsh Springer Spaniel on the beach A spaniel is a type" +
                " of gun dog. Spaniels were especially bred to flush out of denser brush." +
                " By the late 17th century spaniels had been specialized in water and land items. " +
                "The extinct English Water Spaniel was used to retrieve water fowl shot down with arrows. " +
                "Land spaniels were setting spaniels-those that crept forward and pointed their game," +
                " allowing hunters to ensnare them with nets, and springing " +
                "spaniels-those that sprang pheasants and partridges for hunting with falcons," +
                " and rabbits for hunting with greyhounds. During the 17th century," +
                " the role of the spaniel was dramatically changed as Englishmen began " +
                "hunting with flintlocks for wing shooting. Charles Goodall and Julia Gasow (1984) " +
                "write that spaniels were \"transformed from untrained, wild beaters, to smooth," +
                " polished gun dogs.", "Middle", R.drawable.spaniel, R.drawable.cockerspaniel,"#06A9DB"));
    }

}
