package com.olyapasy.happydog;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.olyapasy.happydog.adapter.FirstAdapter;
import com.olyapasy.happydog.model.Item;

import java.util.ArrayList;

public class MakeHappyActivity extends AppCompatActivity {
    ActionBar actionBar;
    ArrayList<Item> items = new ArrayList<Item>();
    FirstAdapter firstAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_happy);
        if(getSupportActionBar() !=null){
            actionBar  = getSupportActionBar();
            actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#06A9DB")));
        }
        fillData();
        firstAdapter = new FirstAdapter(items, this);


        final ListView listView = (ListView) findViewById(R.id.listView);
        // Адаптер.
        // При создании объекта мы должны передать:
        // 1) данные, 2) контекст
        final FirstAdapter adapter = new FirstAdapter(items, this);
        // Присоединили адаптер к списку
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent = new Intent(getBaseContext(),MakeHappyDetailedActivity.class);
                intent.putExtra("itemTitle", items.get(i).getTitle());
                intent.putExtra("itemImage", items.get(i).getImage());
                intent.putExtra("itemDescription", items.get(i).getDescriptionDetailed());

                startActivity(intent);



            }
        });
    }



    void fillData(){
        items.add(new Item("House",
                "Learn what kind of sleeping area your dog would enjoy",
                "Think about the benefits of a dog bed. Buying a bed for " +
                        "your dog to sleep in has multiple benefits. A bed provides much needed" +
                        " cushion and insulation for your pet. A dog bed also controls odors and" +
                        " hair, keeping both at bay by providing a centralized and personal space" +
                        " for your dog to rest. A dog bed can also discourage your dog from " +
                        "curling up on the couch or other off-limits furniture." +
                        "Crate train your dog. Crate training uses a dog kennel " +
                        "to keep the dog in when you aren’t around. Don’t worry:" +
                        " if the dog is trained to use the crate," +
                        " he will generally view it as a safe haven from any daily hubbub. " +
                        "Place the crate in the living room with the door open and a" +
                        " comfortably blanket inside. Encourage the dog to go into the " +
                        "crate on its own by tossing a treat inside. After a few times of" +
                        " doing this over the course of a couple of days, shut the door " +
                        "behind the dog and leave it closed for 10 minutes. Gradually " +
                        "increase the amount of time the dog goes into the crate like" +
                        " this until he is fine with staying in there (no whining or crying)" +
                        " for up to four hours.\n" +
                        "Make sure the crate is appropriately sized for your dog. He should " +
                        "be able to stand normally without a hunched back inside the crate. " +
                        "The crate should also be roomy enough for him to turn around comfortably" +
                        " inside it.\n" +
                        "Never leave a dog in a crate for longer than four hours. Don’t use " +
                        "it as a punishment or he will not willingly go inside the crate.",
                R.drawable.house));
        items.add(new Item("Food",
                "Learn what kind of food your dog would enjoy",
               "\n" +
                       "Keep in mind your pet's age and activity level. " +
                       "Your pet’s energy and nutrition needs are based on multiple" +
                       " factors including growth, activity, reproductive status and age." +
                       " Pet food is geared for feeding during certain life stages of the animal." +
                       " A young growing puppy will need more calories than an older pet." +
                       " A pregnant or lactating dog will also need more calories" +
                       " than its spayed or neutered counterpart. Never feed your dog certain" +
                       " human foods. There are many kinds of foods suitable for humans that should never" +
                       " be fed to your dog, since they are toxic for dogs. These include:\n" +
                       "Alcohol\n" +
                       "Avocados\n" +
                       "Grapes and raisins\n" +
                       "Chocolate\n" +
                       "Any food containing the sweetener Xylitol\n" +
                       "Coffee and tea\n" +
                       "Fruit pits or apple seeds\n" +
                       "Garlic and onions\n" +
                       "Walnuts and macadamia nuts\n" +
                       "Dough made with yeast." +
                       "Read the ingredients of dog food. " +
                       "The most important factor is that the food is high quality." +
                       " This means being able to read and understand the label." +
                       " Most dogs will do just fine on a commercial dog food as long as you " +
                       "remember to read the ingredient list on the can or bag to ensure the food" +
                       " is healthy. These are listed in order of the most prevalent food in the food.\n" +
                       "Meat should be the number one (and preferably the second) ingredient on " +
                       "the list, followed by a grain. By-products are fine but they should be " +
                       "far down the list.\n" +
                       "You can always ask your veterinarian for advice in choosing food for your dog.",
                R.drawable.bowl));
        items.add(new Item("Accessories",
                "Learn what kind of accessories your dog would enjoy",
                "Safety aside, there’s also another big" +
                        " reason for collaring, and thereby leashing, your dog: training. " +
                        "Some collars are designed specifically as training tools," +
                        " but the ones that aren’t are still a valuable tool in teaching" +
                        " your dog to mind his P’s and Q’s. For example, it’d be much harder" +
                        " to teach your pup to heel if he couldn’t begin by learning" +
                        " to associate the word with the action. A slight tug of the" +
                        " leash used in conjunction with the verbal command" +
                        " is a much stronger training tool than verbal commands alone.",
                R.drawable.accessories));
        items.add(new Item("Toys","Learn what kind of toys your pet would enjoy",
                "Get your dog a soft stuffed toy. Plush toys are often " +
                        "popular with many dogs, offering comfort and relaxation. " +
                        "But not all plush toys are safe for dogs. Before you buy your dog " +
                        "a soft stuffed toy, you should look for a soft toy that is small enough" +
                        " for your dog to hold in his mouth and carry around. You should also look " +
                        "for a plush toy that your dog cannot swallow and that appears durable, as" +
                        " you do not want your dog to swallow any pieces of the toy." +
                        " Many dogs will interact with plush toys by shaking or “killing” " +
                        "them through chewing and carrying them.\n",
                R.drawable.toy));
        items.add(new Item("Care",
                "Learn how to take care for a dog",
                "\n" +
                        "Frequently give your dog a good brushing. " +
                        "Dogs need a good brushing regardless of their coat length. " +
                        "This is a good way to bond with your dog." +
                        " It also gives you a chance to monitor the health of your dog’s skin.\n" +
                        "For long-haired dogs, purchase a stripper type of comb to help remove" +
                        " hair that is being shed. Comb through your dog’s hair at " +
                        "least every other day, if not daily. Otherwise, your dog’s fur " +
                        "may form painful mats. These just aren’t ugly to look at, as they " +
                        "can also cause the skin underneath it to get infected.\n" +
                        "For short-haired dogs, use a soft-bristled brush to " +
                        "remove loose hair and stimulate the skin." +
                        "Give your dog a bath once a month." +
                        " If your dog needs a bath, use an all-purpose dog shampoo." +
                        " Follow the directions on the bottle. Don’t go overboard with" +
                        " bathing your dog. Most dogs only need a bath once a month at most. " +
                        "A dog’s skin can dry out from more frequent bathing.\n" +
                        "If you have a dog that gets dirty or smelly more " +
                        "frequently, you may need to bathe it more often. Use your discretion, " +
                        "and contact your vet with any questions. \n" +
                        "Take your dog outside frequently in the beginning. " +
                        "As you start house training your dog, give your dog lots of " +
                        "opportunities to relieve himself. Take him outside frequently," +
                        " up to every half-hour. Puppies especially have small bladders" +
                        " and need to go often.", R.drawable.care));
        items.add(new Item("Medical",
                "Learn about medical help for your dog",
                "Take your puppy to the vet by eight weeks of age." +
                        " If you have a puppy, he should have his first veterinarian" +
                        " visit by 8 weeks of age. If your puppy or dog is older than" +
                        " this and hasn’t been to the veterinarian yet, now is the time" +
                        " to schedule an appointment for an examination and to start or " +
                        "update vaccinations. This is important for your dog’s health.\n" +
                        "Make sure you vaccinate your dog against rabies, as this deadly " +
                        "disease can be caught by humans. It is a legal requirement " +
                        "of many states to vaccinate against rabies." +
                        "alk to an animal nutritionist about a raw food diet. " +
                        "Raw diets are fine for dogs as well, although a " +
                        "bit more time consuming to prepare and store correctly. " +
                        "If you want to feed a raw food diet for your dog, " +
                        "it is absolutely vital to contact an animal nutritionist. " +
                        "Make sure your dog is receiving all the nutrients he or she needs. " +
                        "Dogs do have different nutritional requirements than humans.",
                R.drawable.heart));


    }


}
