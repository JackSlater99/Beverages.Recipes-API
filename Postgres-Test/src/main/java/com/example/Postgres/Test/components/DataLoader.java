package com.example.Postgres.Test.components;

import com.example.Postgres.Test.models.Instructions;
import com.example.Postgres.Test.models.RawIngredient;
import com.example.Postgres.Test.models.Recipe;
import com.example.Postgres.Test.models.RecipeIngredient;
import com.example.Postgres.Test.repositories.IngredientRepository;
import com.example.Postgres.Test.repositories.InstructionRepository;
import com.example.Postgres.Test.repositories.RecipeIngredientRepository;
import com.example.Postgres.Test.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    RecipeRepository recipeRepository;

    @Autowired
    IngredientRepository ingredientRepository;

    @Autowired
    RecipeIngredientRepository recipeIngredientRepository;

    @Autowired
    InstructionRepository instructionRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        RawIngredient milk = new RawIngredient("Milk", "https://i.imgur.com/gyWpF8r.jpg", Boolean.FALSE, "Milk is an excellent source of vitamins and minerals, including “nutrients of concern,” which are under-consumed by many populations. It provides potassium, B12, calcium and vitamin D, which are lacking in many diets. Milk is also a good source of vitamin A, magnesium, zinc and thiamine.");
        ingredientRepository.save(milk);
        RawIngredient groundEspresso = new RawIngredient("Ground Espresso", "https://i.imgur.com/d5Kx6mA.jpg", Boolean.FALSE, "Because espresso is roasted, ground, and brewed differently, it has a unique flavor compared to drip coffee. It usually has a bolder, less acidic taste, with a well-rounded and full-bodied finish. It tastes “stronger,” meaning that it has a rich coffee flavor. The roasting process especially brings out more oils in the beans, so it often has a heavier feel. " );
        ingredientRepository.save(groundEspresso);
        RawIngredient drinkingChocolate = new RawIngredient("Drinking Chocolate", "https://i.imgur.com/OaES1rn.jpg", Boolean.FALSE, "Drinking chocolate, or sipping chocolate, is exactly what it sounds like – luxurious, melted chocolate you can drink!");
        ingredientRepository.save(drinkingChocolate);
        RawIngredient goldenCasterSugar = new RawIngredient("Golden Caster Sugar", "https://i.imgur.com/v9LR6kn.jpg", Boolean.FALSE, "Golden caster sugar: loosely packed and sandy in texture with a warm, golden colour, golden caster sugar is a fine sugar that is ideal for use in creamed sponge cakes. It's the same as normal caster sugar, but it's unrefined, so has more caramel flavours.");
        ingredientRepository.save(goldenCasterSugar);
        RawIngredient vodka = new RawIngredient("Vodka", "https://i.imgur.com/te8EcH1.png", Boolean.TRUE, "Vodka, distilled liquor, clear and colourless and without definite aroma or taste, ranging in alcoholic content from about 40 to 55 percent.");
        ingredientRepository.save(vodka);
        RawIngredient brewedEspressoCoffee = new RawIngredient("Brewed Espresso Coffee", "https://i.imgur.com/TF22NKp.jpg", Boolean.FALSE, "Espresso is brewed by forcing hot water through finely ground coffee under extremely high pressure. This results in a highly concentrated shot of coffee with a caramelly sweetness and a distinctive crema (layer of foam) on top. While it looks simple, pulling a quality shot requires considerable skill and practice.");
        ingredientRepository.save(brewedEspressoCoffee);
        RawIngredient coffeeLiqueur = new RawIngredient("Coffee Liqueur", "https://i.imgur.com/9cdJYVl.jpg", Boolean.TRUE, "Coffee liqueur combines two of many people's favorite drinks: coffee and alcohol. Plenty of sugar is added to balance out the alcohol's sharp taste, usually. While Kahlua is the most well-known and widely sold, it is hardly the only option available.");
        ingredientRepository.save(coffeeLiqueur);
        RawIngredient cucumber = new RawIngredient("Cucumber", "https://i.imgur.com/qTUQf2V.jpg", Boolean.FALSE, "Cucumber is a summer vegetable, with elongate shape and 15cm long. Its skin is of a green colour, turning into yellow in maturation. At present, it is found in the European markets all over the year. Fresh or pickled cucumbers are also available.");
        ingredientRepository.save(cucumber);
        RawIngredient mint = new RawIngredient("Mint", "https://i.imgur.com/gtOXxqX.jpg", Boolean.FALSE, "Mints have square stems and opposite aromatic leaves. Many can spread vegetatively by stolons and can be aggressive in gardens. The small flowers are usually pale purple, pink, or white in colour and are arranged in clusters, either forming whorls or crowded together in a terminal spike.");
        ingredientRepository.save(mint);
        RawIngredient frozenRedBerries = new RawIngredient("Frozen Red Berries", "https://i.imgur.com/pbBolsG.jpg", Boolean.FALSE, "Typically, frozen berry mixes include a blend of blueberries, raspberries, blackberries, cherries, and/or strawberries. Some may add bananas or other fruits as well. Always note whether a berry blend has added sugar, as this will affect flavor and nutrition.");
        ingredientRepository.save(frozenRedBerries);
        RawIngredient lemonade = new RawIngredient("Lemonade", "https://i.imgur.com/uqz78y3.jpg", Boolean.FALSE, "Lemonade is a colourless sweet fizzy drink. A drink that is made from lemons, sugar, and water and is not fizzy can also be referred to as lemonade. He was pouring ice and lemonade into tall glasses. A glass of lemonade can be referred to as a lemonade");
        ingredientRepository.save(lemonade);
        RawIngredient sugar = new RawIngredient("Sugar", "https://i.imgur.com/BPp3Fl5.png", Boolean.FALSE, "A sweet material that consists essentially of sucrose obtained from sugarcane or sugar beets, is typically colorless or white when pure, and is commonly used to sweeten foods and beverages. 2 : any of numerous soluble and usually sweet carbohydrates (as glucose or sucrose) that occur naturally especially in plants.");
        ingredientRepository.save(sugar);
        RawIngredient lime = new RawIngredient("Lime", "https://i.imgur.com/kpC2vbQ.jpg", Boolean.FALSE, "Limes are sour, round, and bright green citrus fruits. They're nutritional powerhouses — high in vitamin C, antioxidants, and other nutrients. There are many species of limes, including the Key lime (Citrus aurantifolia), Persian lime (Citrus latifolia), desert lime (Citrus glauca), and makrut lime (Citrus hystrix).");
        ingredientRepository.save(lime);
        RawIngredient sodaWater = new RawIngredient("Soda Water", "https://i.imgur.com/UyW0h6S.jpg", Boolean.FALSE, "A weak solution of sodium bicarbonate with some acid added to cause effervescence. 2a : a beverage consisting of water highly charged with carbon dioxide. b : soda pop.");
        ingredientRepository.save(sodaWater);
        RawIngredient vermouth = new RawIngredient("Vermouth", "https://i.imgur.com/aqgRVsY.jpg", Boolean.TRUE, "Vermouth is an aromatized wine that includes wine, botanicals, some sugar (or grape juice) and spirits–to fortify the wine. It is the use of botanicals which include herbs, spices, and bitter roots that make Vermouth unique.");
        ingredientRepository.save(vermouth);
        RawIngredient orangeLiqueur = new RawIngredient("Orange Liqueur", "https://i.imgur.com/5XOyG0N.jpg", Boolean.TRUE, "Orange liqueur is the easiest term to define, so here's where I'll start. Orange liqueur is simply a sweetened alcoholic beverage with orange flavoring. The alcohol itself can be either a column-distilled neutral spirit (similar to vodka) or it may be a pot-distilled spirit, such as grape brandy.");
        ingredientRepository.save(orangeLiqueur);
        RawIngredient cranberryJuice = new RawIngredient("Cranberry Juice", "https://i.imgur.com/tjxnXml.jpg", Boolean.FALSE, "Cranberry juice is the liquid juice of the cranberry, typically manufactured to contain sugar, water, and other fruit juices. Cranberry – a fruit native to North America – is recognized for its bright red color, tart taste, and versatility for product manufacturing.");
        ingredientRepository.save(cranberryJuice);
        RawIngredient olive = new RawIngredient("Olive", "https://i.imgur.com/HGj6ZSF.jpg", Boolean.FALSE, "The olive fruit is classed botanically as a drupe, similar to the peach or plum. Within the stone are one or two seeds. Olives tend to have maximum oil content (about 20–30 percent of fresh weight) and greatest weight six to eight months after the blossoms appear.");
        ingredientRepository.save(olive);
        RawIngredient londonDryGin = new RawIngredient("London Dry Gin", "https://i.imgur.com/vv7xDLT.jpg", Boolean.TRUE, "London dry gin is defined as a gin that is infused with botanical flavor through re-distillation. No artificial ingredients are permitted, and no color or flavor can be added after distillation. The predominant flavor must come from juniper. And despite the name, it does not have to be made in London.");
        ingredientRepository.save(londonDryGin);
        RawIngredient lemon = new RawIngredient("Lemon", "https://i.imgur.com/g0TbAXR.jpg", Boolean.FALSE, "The lemon is a round, slightly elongated fruit, it has a strong and resistant skin, with an intense bright yellow colour when it is totaly ripe, giving off a special aroma when it is cut. The pulp is pale yellow, juicy and acid, divided in gores.");
        ingredientRepository.save(lemon);
        RawIngredient bitterBeer = new RawIngredient("Bitter Beer", "https://i.imgur.com/7JgQQHl.jpg", Boolean.TRUE, "Bitter belongs to the pale ale beer style and can have a great variety of strength, flavour and appearance, from dark amber to a golden summer ale. It can be under 3% abv and as high as 7% with premium or strong bitters. The colour may be controlled by the addition of caramel colouring.");
        ingredientRepository.save(bitterBeer);
        RawIngredient tomatoJuice = new RawIngredient("Tomato Juice", "https://i.imgur.com/dDog3GF.jpg", Boolean.FALSE, "Juice extracted from fresh tomatoes by cooking them and then exposing the heated tomatoes to a process that separates the skins and seeds from the juice. The juice is then bottled or canned and can be salted or unsalted, and at times other seasonings are added. Tomato juice is served as a beverage or can be added to dishes for flavoring.");
        ingredientRepository.save(tomatoJuice);
        RawIngredient lemonJuice = new RawIngredient("Lemon Juice", "https://i.imgur.com/vrtVHvQ.jpg", Boolean.FALSE, "The juice from a fresh lemon, which is the best form of lemon flavor. Bottled lemon juice can be substituted if fresh lemons are not available.");
        ingredientRepository.save(lemonJuice);
        RawIngredient worcestershireSauce = new RawIngredient("Worcestershire Sauce", "https://i.imgur.com/21QSNYL.jpg", Boolean.FALSE, "A popular condiment that has a savory flavor and is used to season a wide variety of dishes. This thin dark sauce is made with soy sauce, garlic, onion, molasses, vinegar, anchovies, lime, and a variety of other seasonings. The name Worcestershire refers to the town of Worcester, England where the sauce was first produced commercially.");
        ingredientRepository.save(worcestershireSauce);
        RawIngredient tabasco = new RawIngredient("Tabasco", "https://i.imgur.com/7o0dxot.jpg", Boolean.FALSE, "A trademarked hot sauce that consists of red chile peppers, salt and vinegar. The small, very hot pepper originated in Tabasco, Mexico and the hot sauce was developed by the McIlhenny family more than 125 years ago. Its spicy flavor is used in making Bloody Mary cocktails and many spicy dishes.");
        ingredientRepository.save(tabasco);
        RawIngredient celery = new RawIngredient("Celery", "https://i.imgur.com/XsPGpf7.jpg", Boolean.FALSE, "Celery is a vegetable with long petioles, meaty and succulent that are known by the name of stalks. They may be eaten raw in salads or alone, fried, boiled, with sauces and as a condiment for soups, stews, etc. It can also be used as an aromatic and besides the stalks, the leaves and seeds of the plant are used.");
        ingredientRepository.save(celery);
        RawIngredient ice = new RawIngredient("Ice", "https://i.imgur.com/G6B3CZf.jpg", Boolean.FALSE, "A small block of artificial ice formed in a mold or cut from a larger block and commonly used for icing drinks.");
        ingredientRepository.save(ice);
        RawIngredient salt = new RawIngredient("Salt", "https://i.imgur.com/XGSFQuq.jpg", Boolean.FALSE, "A colorless or white substance that consists of sodium and chlorine and is used in seasoning and preserving food and in industry.");
        ingredientRepository.save(salt);
        RawIngredient blackPepper = new RawIngredient("Black Pepper", "https://i.imgur.com/I5YIIZT.jpg", Boolean.FALSE, "Black pepper is a plant that grows in the tropics, especially in India. The plant is a perennial vine that bears flowers. People cultivate the plant for its fruit, the peppercorn. The peppercorn can be used as a spice or condiment. Usually, it makes things hot.");
        ingredientRepository.save(blackPepper);
        RawIngredient tapiocaStarch = new RawIngredient("Tapioca Starch", "https://i.imgur.com/GQW7INj.jpg", Boolean.FALSE, "Tapioca starch is a gluten-free flour that comes from the cassava plant. You can use it to thicken soups, stews, and gravies, or you can swap out wheat flour with tapioca for gluten-free baking.");
        ingredientRepository.save(tapiocaStarch);
        RawIngredient brownSugar = new RawIngredient("Brown Sugar", "https://i.imgur.com/Jwi8C89.jpg", Boolean.FALSE, "Brown sugar is granulated cane sugar with added molasses. It is coarser and more moist than white sugar and imparts a unique flavor and dark color to food systems.");
        ingredientRepository.save(brownSugar);
        RawIngredient water = new RawIngredient("Water", "https://i.imgur.com/HmarZRY.jpg", Boolean.FALSE, "A substance composed of the chemical elements hydrogen and oxygen and existing in gaseous, liquid, and solid states. It is one of the most plentiful and essential of compounds. A tasteless and odourless liquid at room temperature, it has the important ability to dissolve many other substances.");
        ingredientRepository.save(water);
        RawIngredient blackTea = new RawIngredient("Black Tea", "https://i.imgur.com/oVRMmWq.jpg", Boolean.FALSE, "A type of tea that is more oxidized than oolong, yellow, white and green teas. Black tea is generally stronger in flavour than other teas.");
        ingredientRepository.save(blackTea);
        RawIngredient mango = new RawIngredient("Mango", "https://i.imgur.com/q4zX0im.jpg", Boolean.FALSE, "A mango is a sweet tropical fruit, and it's also the name of the trees on which the fruit grows. Ripe mangoes are juicy, fleshy, and delicious.");
        ingredientRepository.save(mango);
        RawIngredient plainYogurt = new RawIngredient("Plain Yogurt", "https://i.imgur.com/i6DL0bs.jpg", Boolean.FALSE, "Made from whole, low-fat, or nonfat milk that is fermented with bacterial cultures, the bacteria in Yogurt allows the milk to congeal, giving it a thick, creamy texture. The flavor is slightly acidic and it is often blended with natural fruit flavors or pieces of fruit to enhance the flavor. Yogurt is high in protein and calcium along with many B vitamins.");
        ingredientRepository.save(plainYogurt);
        RawIngredient cinnamon = new RawIngredient("Cinnamon", "https://i.imgur.com/QN1byhC.jpg", Boolean.FALSE, "The spice, consisting of the dried inner bark, is brown in colour and has a delicately fragrant aroma and a warm sweet flavour. Cinnamon is used to flavour a variety of foods, from confections to curries to beverages, and is popular in bakery goods in many places.");
        ingredientRepository.save(cinnamon);
        RawIngredient groundCardamom = new RawIngredient("", "https://i.imgur.com/g23azPo.jpg", Boolean.FALSE, "A spice consisting of whole or ground dried fruits, or seeds, of Elettaria cardamomum, a herbaceous perennial plant of the ginger family (Zingiberaceae). The seeds have a warm, slightly pungent, and highly aromatic flavour somewhat reminiscent of camphor.");
        ingredientRepository.save(groundCardamom);
        RawIngredient instantCoffee = new RawIngredient("Instant Coffee", "https://i.imgur.com/KN5G31V.jpg", Boolean.FALSE, "Instant coffee is the dried soluble portion of roasted coffee, which can be presented to the consumer in either powder or granule form for immediate make-up in hot water.");
        ingredientRepository.save(instantCoffee);
        RawIngredient hotWater = new RawIngredient("Hot Water", "https://i.imgur.com/n7Lt7Y5.jpg", Boolean.FALSE, "Water that's been heated above its initial temperature. The ideal temperature for domestic hot water is 120 degrees Fahrenheit, or 49 degrees Celsius, to avoid the possibility of scalding.");
        ingredientRepository.save(hotWater);
        RawIngredient strawberry = new RawIngredient("Strawberry", "https://i.imgur.com/VpHcS2w.jpg", Boolean.FALSE, "Strawberries are soft, sweet, bright red berries. They're also delicious. Strawberries have tiny edible seeds, which grow all over their surface. When ripe, strawberries smell wonderful and taste even better. You can make jam, pie, strawberry shortcake, and more with strawberries.");
        ingredientRepository.save(strawberry);
        RawIngredient honey = new RawIngredient("Honey", "https://i.imgur.com/X6wO5Lf.jpg", Boolean.FALSE, "Honey is a thick, sweet fluid produced by bees from plant nectars. It is commonly used as a sweetener in food, but should be avoided in infants. Some chemicals in honey might kill certain bacteria and fungus.");
        ingredientRepository.save(honey);
        RawIngredient whiteRice = new RawIngredient("White Rice", "https://i.imgur.com/35RoUbm.jpg", Boolean.FALSE, "The starchy seeds of an annual southeast Asian cereal grass (Oryza sativa) that are cooked and used for food");
        ingredientRepository.save(whiteRice);
        RawIngredient choppedAlmonds = new RawIngredient("Chopped Almonds", "https://i.imgur.com/IxLf1jK.jpg", Boolean.FALSE, "The almond is the edible kernel of the fruit of the sweet almond tree. It is a bright white fruti and wrapped in a reddish brown cover. It is consumed as dry fruit, fried and/or salted. Some well-known products, such as nougat and marzipan, are made of almonds.");
        ingredientRepository.save(choppedAlmonds);
        RawIngredient vanilla = new RawIngredient("Vanilla", "https://i.imgur.com/aretJyR.jpg", Boolean.FALSE, "Vanilla is strongly aromatic and contributes warm, floral notes. It’s a gentle but distinct flavor that complements many other spices and foods.");
        ingredientRepository.save(vanilla);
        RawIngredient evaporatedMilk = new RawIngredient("Evaporated Milk", "https://i.imgur.com/zfPg1ux.jpg", Boolean.FALSE, "Evaporated milk, known in some countries as \"unsweetened condensed milk\", is a shelf-stable canned cow’s milk product where about 60% of the water has been removed from fresh milk. It differs from sweetened condensed milk, which contains added sugar.");
        ingredientRepository.save(evaporatedMilk);
        RawIngredient thaiTea = new RawIngredient("Thai Tea", "https://i.imgur.com/NbOtDaR.jpg", Boolean.FALSE, "Thai tea is infused with star anise and cloves and sweetened with sugar or sweetened condensed milk.");
        ingredientRepository.save(thaiTea);
        RawIngredient sweetenedCondensedMilk = new RawIngredient("Sweetened Condensed Milk", "https://i.imgur.com/4jwn0B3.jpg", Boolean.FALSE, "Sweetened condensed milk is made by removing most of the water from cow's milk. It's sweeter and higher in calories than evaporated milk, as sugar is added as a preservative. It can add flavor to desserts, coffee and certain stews but is unsuitable for people with milk protein allergy or lactose intolerance.");
        ingredientRepository.save(sweetenedCondensedMilk);
        RawIngredient yuja = new RawIngredient("Yuja", "https://i.imgur.com/YVxglUb.jpg", Boolean.FALSE, "Intensely aromatic, its major antecedent among several arcane citruses is the mandarin, which thus gives a sweet-sharp flavour that is both orangey and lemony but also includes a fresh hint of green that all combine to make something lively and individual; some detect the presence of grapefruit flavour too.");
        ingredientRepository.save(yuja);
        RawIngredient ginger = new RawIngredient("Ginger", "https://i.imgur.com/1klXEvE.jpg", Boolean.FALSE, "Ginger is used as a cooking spice throughout the world. It's used as a food flavoring and medicine. Ginger contains chemicals that might reduce nausea and swelling.");
        ingredientRepository.save(ginger);
        RawIngredient clove = new RawIngredient("Clove", "https://i.imgur.com/8c0QnWp.jpg", Boolean.FALSE, "Cloves are a pungent warm spice with an intense flavor and aroma. The flavor comes from the compound eugenol. On the tongue, you'll detect sweetness, bitterness, and astringency (drying the mouth), with a noticeable amount of heat.");
        ingredientRepository.save(clove);

        // COFFEE

//        FLAT WHITE
        RecipeIngredient coffeeIngredient1 = new RecipeIngredient(milk, 100, "ml");
        recipeIngredientRepository.save(coffeeIngredient1);
        RecipeIngredient coffeeIngredient2 = new RecipeIngredient(groundEspresso, 18, "g");
        recipeIngredientRepository.save(coffeeIngredient2);
        RecipeIngredient coffeeIngredient3 = new RecipeIngredient(milk, 250, "ml");
        recipeIngredientRepository.save(coffeeIngredient3);
        RecipeIngredient coffeeIngredient4 = new RecipeIngredient(drinkingChocolate, 1, "tsp");
        recipeIngredientRepository.save(coffeeIngredient4);
        RecipeIngredient coffeeIngredient5 = new RecipeIngredient(milk, 150, "ml");
        recipeIngredientRepository.save(coffeeIngredient5);
        RecipeIngredient coffeeIngredient6 = new RecipeIngredient(goldenCasterSugar, 100, "g");
        recipeIngredientRepository.save(coffeeIngredient6);
        RecipeIngredient coffeeIngredient7 = new RecipeIngredient(vodka, 100, "ml");
        recipeIngredientRepository.save(coffeeIngredient7);
        RecipeIngredient coffeeIngredient8 = new RecipeIngredient(groundEspresso, 50, "ml");
        recipeIngredientRepository.save(coffeeIngredient8);
        RecipeIngredient coffeeIngredient9 = new RecipeIngredient(coffeeLiqueur, 50, "ml");
        recipeIngredientRepository.save(coffeeIngredient9);

        Recipe flatWhite = new Recipe(
                "Flat White",
                "Jack",
                true,
                "Coffee",
                "https://i.imgur.com/u0uNgqi.jpg",
                "Easy",
                3,
                "https://www.youtube.com/embed/-50tS3d2Yao"
        );

        flatWhite.addIngredients(coffeeIngredient1);
        flatWhite.addIngredients(coffeeIngredient2);
        recipeRepository.save(flatWhite);
        Instructions flatWhiteInstruction1 = new Instructions("Make around 35ml espresso using your coffee machine and pour into the base of your cup.", flatWhite);
        instructionRepository.save(flatWhiteInstruction1);
        Instructions flatWhiteInstruction2 = new Instructions("Steam the milk with the steamer attachment so that it has around 1-2cm of foam on top. Hold the jug so that the spout is about 3-4cm above the cup and pour the milk in steadily. As the volume within the cup increases, bring the jug as close to the surface of the drink as possible whilst aiming to pour into the centre. Once the milk jug is almost touching the surface of the coffee, tilt the jug to speed up the rate of pour. As you accelerate, the milk will hit the back of the cup and start naturally folding in on itself to create a pattern on the top.", flatWhite);
        instructionRepository.save(flatWhiteInstruction2);

//        MOCHA
        Recipe mocha = new Recipe(
                "Mocha",
                "Jack",
                true,
                "Coffee",
                "https://i.imgur.com/l8YPCim.jpg",
                "Medium",
                3,
                "https://www.youtube.com/embed/g86JjlpegIM"
        );

        mocha.addIngredients(coffeeIngredient2);
        mocha.addIngredients(coffeeIngredient3);
        mocha.addIngredients(coffeeIngredient4);
        recipeRepository.save(mocha);
        Instructions mochaInstruction1 = new Instructions("Make around 35ml espresso using a coffee machine and pour into the base of your cup. Add the drinking chocolate and mix well until smooth.", mocha);
        instructionRepository.save(mochaInstruction1);
        Instructions mochaInstruction2 = new Instructions("Steam the milk with the steamer attachment so that it has around 4-6cm of foam on top. Hold the jug so that the spout is about 3-4cm above the cup and pour the milk in steadily. As the volume within the cup increases, bring the jug as close to the surface of the drink as possible whilst aiming into the centre. Once the milk jug is almost touching the surface of the coffee, tilt to speed up the rate of pour. As you accelerate, the milk will hit the back of the cup and start naturally folding in on itself to create a pattern on the top.", mocha);
        instructionRepository.save(mochaInstruction2);

//        CAPPUCCINO
        Recipe cappuccino = new Recipe(
                "Cappuccino",
                "Jack",
                true,
                "Coffee",
                "https://i.imgur.com/Gglcd3D.jpg",
                "Easy",
                3,
                "https://youtu.be/gvPetTPFsZM"
        );

        cappuccino.addIngredients(coffeeIngredient2);
        cappuccino.addIngredients(coffeeIngredient5);
        recipeRepository.save(cappuccino);
        Instructions cappuccinoInstruction1 = new Instructions("Make around 35ml espresso using a coffee machine and pour it into the base of your cup.", cappuccino);
        instructionRepository.save(cappuccinoInstruction1);
        Instructions cappuccinoInstruction2 = new Instructions("Steam the milk with the steamer attachment so that it has around 4-6cm of foam on top. Hold the jug so that the spout is about 3-4cm above the cup and pour the milk in steadily. As the volume within the cup increases, bring the jug as close to the surface of the drink as possible whilst aiming to pour into the centre. Once the milk jug is almost touching the surface of the coffee, tilt the jug to speed up the rate of pour. As you accelerate, the milk will hit the back of the cup and start naturally folding in on itself to create a pattern on the top. Dust the surface with a little cocoa powder if you like.", cappuccino);
        instructionRepository.save(cappuccinoInstruction2);

//        LATTE
        Recipe latte = new Recipe(
                "Latte",
                "Jack",
                true,
                "Coffee",
                "https://i.imgur.com/VtuKUEa.jpg",
                "Easy",
                3,
                "https://www.youtube.com/embed/0PN0MwTcbxI"
        );

        latte.addIngredients(coffeeIngredient2);
        latte.addIngredients(coffeeIngredient3);
        recipeRepository.save(latte);
        Instructions latteInstruction1 = new Instructions("Make around 35ml espresso using your coffee machine and pour it into the base of your cup.", latte);
        instructionRepository.save(latteInstruction1);
        Instructions latteInstruction2 = new Instructions("Steam the milk with the steamer attachment so that it has around 2-3cm of foam on top. Hold the jug so that the spout is about 3-4cm above the cup and pour the milk in steadily. As the volume within the cup increases, bring the jug as close to the surface of the drink as possible whilst aiming to pour into the centre. Once the milk jug is almost touching the surface of the coffee, tilt to speed up the rate of pour. As you accelerate, the milk will hit the back of the cup and start naturally folding in on itself to create a pattern on the top.", latte);
        instructionRepository.save(latteInstruction2);

//        ESPRESSO MARTINI
        Recipe espressoMartini = new Recipe(
                "Espresso Martini",
                "Jack",
                true,
                "Coffee",
                "https://i.imgur.com/aUGAqRN.jpg",
                "Easy",
                5,
                "https://www.youtube.com/embed/U4WJ7Ljy4K0"
        );

        espressoMartini.addIngredients(coffeeIngredient6);
        espressoMartini.addIngredients(coffeeIngredient7);
        espressoMartini.addIngredients(coffeeIngredient8);
        espressoMartini.addIngredients(coffeeIngredient9);
        recipeRepository.save(espressoMartini);
        Instructions espressoMartiniInstruction1 = new Instructions("Start by making the sugar syrup. Put the caster sugar in a small pan over a medium heat and pour in 50ml water. Stir, and bring to the boil.", espressoMartini);
        instructionRepository.save(espressoMartiniInstruction1);
        Instructions espressoMartiniInstruction2 = new Instructions("Turn off the heat and allow the mixture to cool. Put 2 martini glasses in the fridge to chill.", espressoMartini);
        instructionRepository.save(espressoMartiniInstruction2);
        Instructions espressoMartiniInstruction3 = new Instructions("Once the sugar syrup is cold, pour 1 tbsp into a cocktail shaker along with a handful of ice, the vodka, espresso and coffee liqueur. Shake until the outside of the cocktail shaker feels icy cold.", espressoMartini);
        instructionRepository.save(espressoMartiniInstruction3);
        Instructions espressoMartiniInstruction4 = new Instructions("Strain into the chilled glasses. Garnish each one with coffee beans if you like.", espressoMartini);
        instructionRepository.save(espressoMartiniInstruction4);

//        DALGONA
        RecipeIngredient dalgonaIngredient1 = new RecipeIngredient(instantCoffee, 4, "tbsp");
        recipeIngredientRepository.save(dalgonaIngredient1);
        RecipeIngredient dalgonaIngredient2 = new RecipeIngredient(sugar, 4, "tbsp");
        recipeIngredientRepository.save(dalgonaIngredient2);
        RecipeIngredient dalgonaIngredient3 = new RecipeIngredient(hotWater, 4, "tbsp");
        recipeIngredientRepository.save(dalgonaIngredient3);

        Recipe dalgona = new Recipe("Dalgona", "SeonkyongLongest", false, "Coffee", "https://i.imgur.com/bmlB7pQ.jpg", "Easy", 5, "https://www.youtube.com/embed/d0mFY8PtmpA");
        dalgona.addIngredients(dalgonaIngredient1);
        dalgona.addIngredients(dalgonaIngredient2);
        dalgona.addIngredients(dalgonaIngredient3);
        recipeRepository.save(dalgona);

        Instructions dalgonaInstruction1 = new Instructions("Combine instant coffee, sugar and hot water in a large mixing bowl. Whip with a hand mixer start from low speed and slowly increase the speed to high. Whip it until it’s foamy and soft pick, about 5 minutes.", dalgona);
        instructionRepository.save(dalgonaInstruction1);
        Instructions dalgonaInstruction2 = new Instructions("Fill up a glass with your choice of milk 3/4 way with or without ice. Top it up with foamy whipped coffee. Mix well before drink. Enjoy!", dalgona);
        instructionRepository.save(dalgonaInstruction2);

        // MOCKTAILS

//        SUMMER CUP MOCKTAIL
        RecipeIngredient summerCupMocktailIngredient1 = new RecipeIngredient(cucumber, 1, "cm");
        recipeIngredientRepository.save(summerCupMocktailIngredient1);
        RecipeIngredient summerCupMocktailIngredient2 = new RecipeIngredient(mint, 1, "sprig");
        recipeIngredientRepository.save(summerCupMocktailIngredient2);
        RecipeIngredient summerCupMocktailIngredient3 = new RecipeIngredient(frozenRedBerries, 5, "");
        recipeIngredientRepository.save(summerCupMocktailIngredient3);
        RecipeIngredient summerCupMocktailIngredient4 = new RecipeIngredient(lemonade, 120, "ml");
        recipeIngredientRepository.save(summerCupMocktailIngredient4);

        Recipe summerCupMocktail = new Recipe(
                "Summer Cup Mocktail",
                "Jack",
                false,
                "Mocktail",
                "https://i.imgur.com/zFrmj7z.jpg",
                "Easy",
                5,
                "https://www.youtube.com/embed/FXR_gyXlCVs"
        );

        summerCupMocktail.addIngredients(summerCupMocktailIngredient1);
        summerCupMocktail.addIngredients(summerCupMocktailIngredient2);
        summerCupMocktail.addIngredients(summerCupMocktailIngredient3);
        summerCupMocktail.addIngredients(summerCupMocktailIngredient4);
        recipeRepository.save(summerCupMocktail);
        Instructions summerCupMocktailInstruction1 = new Instructions("Chop the cucumber and mint sprig into small pieces. Bring 200ml water to the boil in a small pan and then add the mint and cucumber. Turn off the heat and leave for 2 mins. Add a small handful of frozen berries, let them defrost for a minute, then crush them lightly with the back of a spoon. Strain the mixture. This will keep in the fridge for up to 24 hours and will be enough to make four drinks.", summerCupMocktail);
        instructionRepository.save(summerCupMocktailInstruction1);
        Instructions summerCupMocktailInstruction2 = new Instructions("Pour 40ml of your strained mixture into a tall glass. Add a handful of ice and top up with 120ml lemonade. Garnish with whatever chopped fruit you like or some more frozen berries and mint leaves if you have them. Stir gently to combine.", summerCupMocktail);
        instructionRepository.save(summerCupMocktailInstruction2);


//        VIRGIN MOJITO
        RecipeIngredient virginMojitoIngredient1 = new RecipeIngredient(sugar, 1, "tbsp");
        recipeIngredientRepository.save(virginMojitoIngredient1);
        RecipeIngredient virginMojitoIngredient2 = new RecipeIngredient(mint, 1, "sprig");
        recipeIngredientRepository.save(virginMojitoIngredient2);
        RecipeIngredient virginMojitoIngredient3 = new RecipeIngredient(lime, 3, "juiced");
        recipeIngredientRepository.save(virginMojitoIngredient3);
        RecipeIngredient virginMojitoIngredient4 = new RecipeIngredient(sodaWater, 120, "ml");
        recipeIngredientRepository.save(virginMojitoIngredient4);

        Recipe virginMojito = new Recipe(
                "Virgin Mojito",
                "Jack",
                true,
                "Mocktail",
                "https://i.imgur.com/bGRaRHA.jpg",
                "Easy",
                5,
                "https://www.youtube.com/embed/5DW0t34Lr5Y");

        virginMojito.addIngredients(virginMojitoIngredient1);
        virginMojito.addIngredients(virginMojitoIngredient2);
        virginMojito.addIngredients(virginMojitoIngredient3);
        virginMojito.addIngredients(virginMojitoIngredient4);
        recipeRepository.save(virginMojito);
        Instructions virginMojitoInstruction1 = new Instructions("Muddle the sugar with leaves from the mint using a pestle and mortar (or use a small bowl and the end of a rolling pin).", virginMojito);
        instructionRepository.save(virginMojitoInstruction1);
        Instructions virginMojitoInstruction2 = new Instructions("Put a handful of crushed ice into 2 tall glasses. Divide the lime juice between the glasses with the mint mix. Add a straw and top up with soda water.", virginMojito);
        instructionRepository.save(virginMojitoInstruction2);

    // MARTINIS

//        VODKA MARTINI
        RecipeIngredient martiniIngredient1 = new RecipeIngredient(vodka, 60, "ml");
        recipeIngredientRepository.save(martiniIngredient1);
        RecipeIngredient martiniIngredient2 = new RecipeIngredient(vermouth, 1, "tbsp");
        recipeIngredientRepository.save(martiniIngredient2);

        Recipe vodkaMartini = new Recipe(
            "Vodka Martini",
            "Jack",
            true,
            "Martini",
            "https://i.imgur.com/cKCXoJj.jpg",
            "Easy",
            5,
            "https://www.youtube.com/embed/n5RNgIUtPv0"
    );

        vodkaMartini.addIngredients(martiniIngredient1);
        vodkaMartini.addIngredients(martiniIngredient2);
        recipeRepository.save(vodkaMartini);
        Instructions vodkaMartiniInstruction1 = new Instructions("Stir the vodka, dry vermouth and a little ice together or put them in a cocktail shaker to combine.", vodkaMartini);
        instructionRepository.save(vodkaMartiniInstruction1);
        Instructions vodkaMartiniInstruction2 = new Instructions("Strain into a chilled martini glass. Serve with an olive on a cocktail stick or a twist of lemon peel.", vodkaMartini);
        instructionRepository.save(vodkaMartiniInstruction2);

//        COSMOPOLITAN
        RecipeIngredient martiniIngredient3 = new RecipeIngredient(vodka, 120, "ml");
        recipeIngredientRepository.save(martiniIngredient3);
        RecipeIngredient martiniIngredient4 = new RecipeIngredient(orangeLiqueur, 60, "ml");
        recipeIngredientRepository.save(martiniIngredient4);
        RecipeIngredient martiniIngredient5 = new RecipeIngredient(cranberryJuice, 60, "ml");
        recipeIngredientRepository.save(martiniIngredient5);
        RecipeIngredient martiniIngredient6 = new RecipeIngredient(lime, 1, "juiced");
        recipeIngredientRepository.save(martiniIngredient6);

        Recipe cosmopolitan = new Recipe(
                "Cosmopolitan",
                "Jack",
                true,
                "Martini",
                "https://i.imgur.com/vwdoYKl.jpg",
                "Easy",
                5,
                "https://www.youtube.com/embed/TnkMtoDNgxE"
        );

        cosmopolitan.addIngredients(martiniIngredient3);
        cosmopolitan.addIngredients(martiniIngredient4);
        cosmopolitan.addIngredients(martiniIngredient5);
        cosmopolitan.addIngredients(martiniIngredient6);
        recipeRepository.save(cosmopolitan);
        Instructions cosmopolitanInstruction1 = new Instructions("Stir the ingredients and a little ice together or put them in a cocktail shaker to combine. Strain into two chilled martini glasses.", cosmopolitan);
        instructionRepository.save(cosmopolitanInstruction1);


//        DIRTY MARTINI
        RecipeIngredient martiniIngredient7 = new RecipeIngredient(olive, 6, "pitted with brine");
        recipeIngredientRepository.save(martiniIngredient7);
        RecipeIngredient martiniIngredient8 = new RecipeIngredient(londonDryGin, 150, "ml");
        recipeIngredientRepository.save(martiniIngredient8);
        RecipeIngredient martiniIngredient9 = new RecipeIngredient(vermouth, 25, "ml");
        recipeIngredientRepository.save(martiniIngredient9);

        Recipe dirtyMartini = new Recipe(
                "Dirty Martini",
                "Jack",
                true,
                "Martini",
                "https://i.imgur.com/CqoVEws.jpg",
                "Easy",
                5,
                "https://www.youtube.com/embed/3GZH-qgsybI"
        );

        dirtyMartini.addIngredients(martiniIngredient7);
        dirtyMartini.addIngredients(martiniIngredient8);
        dirtyMartini.addIngredients(martiniIngredient9);
        recipeRepository.save(dirtyMartini);
        Instructions dirtyMartiniInstruction1 = new Instructions("Put two martini glasses in the fridge to chill. Thread the olives onto two cocktail sticks and set aside.", dirtyMartini);
        instructionRepository.save(dirtyMartiniInstruction1);
        Instructions dirtyMartiniInstruction2 = new Instructions("Fill a jug or mixing glass with the ice, then pour in the gin, vermouth and olive brine. Stir until the outside of the jug feels cold. Taste to make sure that it's icy cold and that you’re happy with the dilution.", dirtyMartini);
        instructionRepository.save(dirtyMartiniInstruction2);
        Instructions dirtyMartiniInstruction3 = new Instructions("Strain the mix into the chilled glasses and garnish with the olive skewers.", dirtyMartini);
        instructionRepository.save(dirtyMartiniInstruction3);

//        // Cocktail

//        CLASSIC SHANDY
        RecipeIngredient classicShandyIngredient1 = new RecipeIngredient(lemon , 2, "slices");
        recipeIngredientRepository.save(classicShandyIngredient1);
        RecipeIngredient classicShandyIngredient2 = new RecipeIngredient(bitterBeer, 200, "ml");
        recipeIngredientRepository.save(classicShandyIngredient2);
        RecipeIngredient classicShandyIngredient3 = new RecipeIngredient(lemonade, 200, "ml");
        recipeIngredientRepository.save(classicShandyIngredient3);

        Recipe classicShandy = new Recipe(
                "Classic Shandy",
                "Jack",
                true,
                "Cocktail",
                "https://i.imgur.com/ez3w2Lk.jpg",
                "Easy",
                5,
                "https://www.youtube.com/embed/7EHeAe_QZK8"
        );

        classicShandy.addIngredients(classicShandyIngredient1);
        classicShandy.addIngredients(classicShandyIngredient2);
        classicShandy.addIngredients(classicShandyIngredient3);
        recipeRepository.save(classicShandy);
        Instructions classicShandyInstruction1 = new Instructions("Drop a lemon slice into a tall drinking glass. Pour over the beer and lemonade.", classicShandy);
        instructionRepository.save(classicShandyInstruction1);
        Instructions classicShandyInstruction2 = new Instructions("Stir well, then make a small cut in a second lemon slice and use this to garnish the rim of the glass.", classicShandy);
        instructionRepository.save(classicShandyInstruction2);

//        BLOODY MARY
        RecipeIngredient maryIngredient1 = new RecipeIngredient(vodka, 100, "ml");
        recipeIngredientRepository.save(maryIngredient1);
        RecipeIngredient maryIngredient2 = new RecipeIngredient(tomatoJuice, 500, "ml");
        recipeIngredientRepository.save(maryIngredient2);
        RecipeIngredient maryIngredient3 = new RecipeIngredient(lemonJuice, 1, "tbsp");
        recipeIngredientRepository.save(maryIngredient3);
        RecipeIngredient maryIngredient4 = new RecipeIngredient(worcestershireSauce, 3, "shakes");
        recipeIngredientRepository.save(maryIngredient4);
        RecipeIngredient maryIngredient5 = new RecipeIngredient(tabasco, 3, "shakes");
        recipeIngredientRepository.save(maryIngredient5);
        RecipeIngredient maryIngredient6 = new RecipeIngredient(celery, 2, "sticks");
        recipeIngredientRepository.save(maryIngredient6);
        RecipeIngredient maryIngredient7 = new RecipeIngredient(ice, 1, "handful");
        recipeIngredientRepository.save(maryIngredient7);
        RecipeIngredient maryIngredient8 = new RecipeIngredient(salt, 1, "pinch");
        recipeIngredientRepository.save(maryIngredient8);
        RecipeIngredient maryIngredient9 = new RecipeIngredient(blackPepper, 1, "pinch");
        recipeIngredientRepository.save(maryIngredient9);

        Recipe bloodyMary = new Recipe("Bloody Mary", "BBC Good Food", true, "Cocktail", "https://i.imgur.com/74rMM8s.jpg", "Easy", 5, "https://www.youtube.com/embed/C5XvpOKrJds");
        bloodyMary.addIngredients(maryIngredient1);
        bloodyMary.addIngredients(maryIngredient2);
        bloodyMary.addIngredients(maryIngredient3);
        bloodyMary.addIngredients(maryIngredient4);
        bloodyMary.addIngredients(maryIngredient5);
        bloodyMary.addIngredients(maryIngredient6);
        bloodyMary.addIngredients(maryIngredient7);
        bloodyMary.addIngredients(maryIngredient8);
        bloodyMary.addIngredients(maryIngredient9);
        recipeRepository.save(bloodyMary);

        Instructions bloodyMaryInstruction1 = new Instructions("Place the ice in a large jug. Measure the vodka, tomato juice and lemon juice and pour it straight onto the ice.", bloodyMary);
        instructionRepository.save(bloodyMaryInstruction1);
        Instructions bloodyMaryInstruction2 = new Instructions("Add 3 shakes of Worcestershire sauce and Tabasco (or more if you like it very spicy) and a pinch of salt and pepper. Stir until the outside of the jug feels cold, then strain the cocktail into 2 tall glasses.", bloodyMary);
        instructionRepository.save(bloodyMaryInstruction2);
        Instructions bloodyMaryInstruction3 = new Instructions("", bloodyMary);
        instructionRepository.save(bloodyMaryInstruction3);

//        TEAS:

//        BROWN SUGAR BOBA
        RecipeIngredient bobaIngredient1 = new RecipeIngredient(tapiocaStarch, 160, "g");
        recipeIngredientRepository.save(bobaIngredient1);
        RecipeIngredient bobaIngredient2 = new RecipeIngredient(brownSugar, 160, "g");
        recipeIngredientRepository.save(bobaIngredient2);
        RecipeIngredient bobaIngredient3 = new RecipeIngredient(water, 80, "ml");
        recipeIngredientRepository.save(bobaIngredient3);
        RecipeIngredient bobaIngredient4 = new RecipeIngredient(blackTea, 2, "bags");
        recipeIngredientRepository.save(bobaIngredient4);
        RecipeIngredient bobaIngredient5 = new RecipeIngredient(milk, 118, "ml");
        recipeIngredientRepository.save(bobaIngredient5);
        RecipeIngredient bobaIngredient6 = new RecipeIngredient(ice, 1, "handful");
        recipeIngredientRepository.save(bobaIngredient6);

        Recipe brownSugarBoba = new Recipe("Brown Sugar Boba", "Tiffy Cooks", false, "Tea", "https://i.imgur.com/2zBworp.jpg", "Medium", 10, "https://www.youtube.com/embed/EA1skTLzBnQ")

        brownSugarBoba.addIngredients(bobaIngredient1);
        brownSugarBoba.addIngredients(bobaIngredient2);
        brownSugarBoba.addIngredients(bobaIngredient3);
        brownSugarBoba.addIngredients(bobaIngredient4);
        brownSugarBoba.addIngredients(bobaIngredient5);
        brownSugarBoba.addIngredients(bobaIngredient6);
        recipeRepository.save(brownSugarBoba);

        Instructions bobaInstructions1 = new Instructions("In a pot, mix 3 tbsp of Tapioca Flour, 80 ml of water, and 60g of brown sugar. Make sure everything is thoroughly combined before bringing it to the stove.", brownSugarBoba);
        instructionRepository.save(bobaInstructions1);
        Instructions bobaInstructions2 = new Instructions("Turn the heat to medium-high and keep stirring until it becomes a thick and sticky consistency. Turn the heat off, and add in the remaining tapioca starch. Mix until slightly cooled down and pour onto a clean surface. (Not everything will be mixed well, but it’s ok)", brownSugarBoba);
        instructionRepository.save(bobaInstructions2);
        Instructions bobaInstructions3 = new Instructions("Once it is safe to knead (warm), knead until it becomes a smooth consistency with no lumps. This process takes around 5 minutes. If it is too sticky, you can add in a bit of bit more Tapioca Starch, but make sure to keep kneading.", brownSugarBoba);
        instructionRepository.save(bobaInstructions3);
        Instructions bobaInstructions4 = new Instructions("Cut into 4 pieces. Roll out each piece and cut it into small pieces. The size depends on how big you prefer your pearls to be. The pearls do expand a little bit once you cook them.", brownSugarBoba);
        instructionRepository.save(bobaInstructions4);
        Instructions bobaInstructions5 = new Instructions("Roll the pieces into a ball and coat with tapioca starch. At this point, you can freeze the tapioca balls in the freezer for up to 1 month.", brownSugarBoba);
        instructionRepository.save(bobaInstructions5);
        Instructions bobaInstructions6 = new Instructions("Boil a big pot of water and once everything is simmering, add in the tapioca starch. Let it cook on medium heat for 25 minutes. Make sure to stir occasionally, so it doesn’t stick to the bottom. After 25 minutes, put the lid on, turn the heat off and let it rest for another 15 minutes. (If you prefer your boba to be on the softer side, simmer for an extra 5 minutes, and rest for another 5 minutes.)", brownSugarBoba);
        instructionRepository.save(bobaInstructions6);
        Instructions bobaInstructions7 = new Instructions("Drain the boba and let it rest in cold water until ready to use.", brownSugarBoba);
        instructionRepository.save(bobaInstructions7);
        Instructions bobaInstructions8 = new Instructions("To make the thick brown sugar glaze. In a pot, add in remaining brown sugar and turn the heat up to medium. Heat the brown sugar and mix for 2-3 minutes or until slightly melted. Add in drained boba and mix till it becomes a thick consistency, around another 2-3 minutes.", brownSugarBoba);
        instructionRepository.save(bobaInstructions8);
        Instructions bobaInstructions9 = new Instructions("Using two tea bags, steep ¼ cup of tea. In a cup, add in the brown sugar boba, swirl the brown sugar boba around the cup, so it leaves a tiger pattern. Add in steep tea, ice, and milk. Enjoy!", brownSugarBoba);
        instructionRepository.save(bobaInstructions9);

//        THAI ICED TEA
        RecipeIngredient thaiTeaIngredient1 = new RecipeIngredient(thaiTea, 45, "ml");
        recipeIngredientRepository.save(thaiTeaIngredient1);
        RecipeIngredient thaiTeaIngredient2 = new RecipeIngredient(hotWater, 240, "ml");
        recipeIngredientRepository.save(thaiTeaIngredient2);
        RecipeIngredient thaiTeaIngredient3 = new RecipeIngredient(sweetenedCondensedMilk, 22, "ml");
        recipeIngredientRepository.save(thaiTeaIngredient3);
        RecipeIngredient thaiTeaIngredient4 = new RecipeIngredient(sugar, 10, "ml");
        recipeIngredientRepository.save(thaiTeaIngredient4);
        RecipeIngredient thaiTeaIngredient5 = new RecipeIngredient(salt, 1, "pinch");
        recipeIngredientRepository.save(thaiTeaIngredient5);
        RecipeIngredient thaiTeaIngredient6 = new RecipeIngredient(evaporatedMilk, 20, "ml");
        recipeIngredientRepository.save(thaiTeaIngredient6);
        RecipeIngredient thaiTeaIngredient7 = new RecipeIngredient(ice, 1, "handful");
        recipeIngredientRepository.save(thaiTeaIngredient7);

        Recipe thaiIcedTea = new Recipe("Thai Iced Tea", "Hot Thai Kitchen", false, "Tea", "https://i.imgur.com/DLR4vcD.jpg", "Easy", 10, "https://www.youtube.com/embed/rIncobztk6E");
        thaiIcedTea.addIngredients(thaiTeaIngredient1);
        thaiIcedTea.addIngredients(thaiTeaIngredient2);
        thaiIcedTea.addIngredients(thaiTeaIngredient3);
        thaiIcedTea.addIngredients(thaiTeaIngredient4);
        thaiIcedTea.addIngredients(thaiTeaIngredient5);
        thaiIcedTea.addIngredients(thaiTeaIngredient6);
        thaiIcedTea.addIngredients(thaiTeaIngredient7);
        recipeRepository.save(thaiIcedTea);

        Instructions thaiTeaInstruction1 = new Instructions("Steep Thai tea leaves in the hot water for 3-5 minutes—you can steep the tea in a cloth filter bag (as shown in video) or just in a cup and then pour it through a paper filter.", thaiIcedTea);
        instructionRepository.save(thaiTeaInstruction1);
        Instructions thaiTeaInstruction2 = new Instructions("While the tea steeps, combine condensed milk, sugar, salt in a mixing glass. Once the tea is ready, pour the brewed tea into the glass and stir to dissolve the sugar and condensed milk.", thaiIcedTea);
        instructionRepository.save(thaiTeaInstruction2);
        Instructions thaiTeaInstruction3 = new Instructions("When ready to serve, fill a glass all the way to the top with ice and pour in the mixed tea, leaving a little room on top.", thaiIcedTea);
        instructionRepository.save(thaiTeaInstruction3);
        Instructions thaiTeaInstruction4 = new Instructions("Drizzle the top with some evaporated milk and enjoy.", thaiIcedTea);
        instructionRepository.save(thaiTeaInstruction4);

//        YUJACHA
        RecipeIngredient yujaIngredient1 = new RecipeIngredient(yuja, 1, "cup");
        recipeIngredientRepository.save(yujaIngredient1);
        RecipeIngredient yujaIngredient2 = new RecipeIngredient(sugar, 1, "cup");
        recipeIngredientRepository.save(yujaIngredient2);

        Recipe yujacha = new Recipe("Yujacha", "Maangchi", false, "Tea", "https://i.imgur.com/tgWms1H.jpg", "Easy", 5, "https://www.youtube.com/embed/DOV-gx8Wjmc");
        yujacha.addIngredients(yujaIngredient1);
        yujacha.addIngredients(yujaIngredient2);
        recipeRepository.save(yujacha);

        Instructions yujachaInstruction1 = new Instructions("Slice the yuja thinly. Remove as many seeds as you can find. Add to a bowl.", yujacha);
        instructionRepository.save(yujachaInstruction1);
        Instructions yujachaInstruction2 = new Instructions("Add sugar. Mix.", yujacha);
        instructionRepository.save(yujachaInstruction2);
        Instructions yujachaInstruction3 = new Instructions("Add a couple tablespoons of yujacha in a cup or glass. Stir with boiling hot water. Serve right away, with a small spoon. You can drink the tea and eat the rinds and pulp with the spoon.", yujacha);
        instructionRepository.save(yujachaInstruction3);
        Instructions yujachaInstruction4 = new Instructions("It will keep in the fridge for a couple of months.", yujacha);
        instructionRepository.save(yujachaInstruction4);

//        DOODH CHA
        RecipeIngredient doodhIngredient1 = new RecipeIngredient(water, 300, "g");
        recipeIngredientRepository.save(doodhIngredient1);
        RecipeIngredient doodhIngredient2 = new RecipeIngredient(milk, 300, "g");
        recipeIngredientRepository.save(doodhIngredient2);
        RecipeIngredient doodhIngredient3 = new RecipeIngredient(ginger, 8, "g");
        recipeIngredientRepository.save(doodhIngredient3);
        RecipeIngredient doodhIngredient4 = new RecipeIngredient(clove, 1, "piece");
        recipeIngredientRepository.save(doodhIngredient4);
        RecipeIngredient doodhIngredient5 = new RecipeIngredient(groundCardamom, 1, "pinch");
        recipeIngredientRepository.save(doodhIngredient5);
        RecipeIngredient doodhIngredient6 = new RecipeIngredient(sugar, 25, "g");
        recipeIngredientRepository.save(doodhIngredient6);
        RecipeIngredient doodhIngredient7 = new RecipeIngredient(blackTea, 8, "g");
        recipeIngredientRepository.save(doodhIngredient7);

        Recipe doodhCha = new Recipe("Doodh Chat", "Bong Eats", false, "Tea", "https://i.imgur.com/UCcuAVP.jpg", "Medium", 15, "https://www.youtube.com/embed/ntigmnhKrAY");
        doodhCha.addIngredients(doodhIngredient1);
        doodhCha.addIngredients(doodhIngredient2);
        doodhCha.addIngredients(doodhIngredient3);
        doodhCha.addIngredients(doodhIngredient4);
        doodhCha.addIngredients(doodhIngredient5);
        doodhCha.addIngredients(doodhIngredient6);
        doodhCha.addIngredients(doodhIngredient7);
        recipeRepository.save(doodhCha);

        Instructions doodhInstruction1 = new Instructions("Using a mortar and pestle, roughly crush the clove and cardamom pod. This will help release their flavours.", doodhCha);
        instructionRepository.save(doodhInstruction1);
        Instructions doodhInstruction2 = new Instructions("Wash, peel, and dice the ginger roughly.", doodhCha);
        instructionRepository.save(doodhInstruction2);
        Instructions doodhInstruction3 = new Instructions("Set a saucepan over medium-high heat and add the water, clove, cardamom, and ginger.", doodhCha);
        instructionRepository.save(doodhInstruction3);
        Instructions doodhInstruction4 = new Instructions("Cover the pan and let the water come to a boil. Allow the spices to bubble in water for about 4 minutes.", doodhCha);
        instructionRepository.save(doodhInstruction4);
        Instructions doodhInstruction5 = new Instructions("Add the milk, and once it has heated up, add in the tea and sugar.", doodhCha);
        instructionRepository.save(doodhInstruction5);
        Instructions doodhInstruction6 = new Instructions("Allow this milky mixture to boil vigorously. Just when the tea is about to boil over, drop the heat and let it simmer for about 4 minutes. You can see the tea change colour from light brown to a rosy kind of orange.", doodhCha);
        instructionRepository.save(doodhInstruction6);
        Instructions doodhInstruction7 = new Instructions("Strain and serve immediately.", doodhCha);
        instructionRepository.save(doodhInstruction7);


//        MILK

//        MANGO LASSI
        RecipeIngredient lassiIngredient1 = new RecipeIngredient(mango, 1, "cup");
        recipeIngredientRepository.save(lassiIngredient1);
        RecipeIngredient lassiIngredient2 = new RecipeIngredient(plainYogurt, 1, "cup");
        recipeIngredientRepository.save(lassiIngredient2);
        RecipeIngredient lassiIngredient3 = new RecipeIngredient(milk, 0.5, "cup");
        recipeIngredientRepository.save(lassiIngredient3);
        RecipeIngredient lassiIngredient4 = new RecipeIngredient(sugar, 2, "tbsp");
        recipeIngredientRepository.save(lassiIngredient4);
        RecipeIngredient lassiIngredient5 = new RecipeIngredient(cinnamon, 1, "dash");
        recipeIngredientRepository.save(lassiIngredient5);
        RecipeIngredient lassiIngredient6 = new RecipeIngredient(groundCardamom, 0.25, "tsp");
        recipeIngredientRepository.save(lassiIngredient6);

        Recipe mangoLassi = new Recipe("Mango Lassi", "The Wanderlust Kitchen", false, "Fruit", "https://i.imgur.com/ZU2WM0o.jpg", "Easy", 5, "https://www.youtube.com/embed/mlEYpN5o2dQ");
        mangoLassi.addIngredients(lassiIngredient1);
        mangoLassi.addIngredients(lassiIngredient2);
        mangoLassi.addIngredients(lassiIngredient3);
        mangoLassi.addIngredients(lassiIngredient4);
        mangoLassi.addIngredients(lassiIngredient5);
        mangoLassi.addIngredients(lassiIngredient6);
        recipeRepository.save(mangoLassi);

        Instructions lassiInstruction1 = new Instructions("Add all of the ingedients to the bowl of a blender.", mangoLassi);
        instructionRepository.save(lassiInstruction1);
        Instructions lassiInstruction2 = new Instructions("Puree until smooth. Serve immediately!", mangoLassi);
        instructionRepository.save(lassiInstruction2);

//        KOREAN STRAWBERRY MILK
        RecipeIngredient smIngredient1 = new RecipeIngredient(strawberry, 1.5, "lb");
        recipeIngredientRepository.save(smIngredient1);
        RecipeIngredient smIngredient2 = new RecipeIngredient(sugar, 0.25, "cup");
        recipeIngredientRepository.save(smIngredient2);
        RecipeIngredient smIngredient3 = new RecipeIngredient(honey, 3, "tbsp");
        recipeIngredientRepository.save(smIngredient3);
        RecipeIngredient smIngredient4 = new RecipeIngredient(lemonJuice, 1, "tbsp");
        recipeIngredientRepository.save(smIngredient4);
        RecipeIngredient smIngredient5 = new RecipeIngredient(milk, 0.5, "cup");
        recipeIngredientRepository.save(smIngredient5);

        Recipe strawberryMilk = new Recipe("Korean Strawberry Milk", "Tiffy Cooks", false, "Fruit", "https://i.imgur.com/qyNJYSG.jpg", "Easy", 20, "https://www.youtube.com/embed/FTScG6IWFiY");
        strawberryMilk.addIngredients(smIngredient1);
        strawberryMilk.addIngredients(smIngredient2);
        strawberryMilk.addIngredients(smIngredient3);
        strawberryMilk.addIngredients(smIngredient4);
        strawberryMilk.addIngredients(smIngredient5);

        Instructions smInstruction1 = new Instructions("Cut strawberries into cubes and add ⅔ of the strawberry into a pot.", strawberryMilk);
        instructionRepository.save(smInstruction1)
        Instructions smInstruction2 = new Instructions("In the pot, add honey, sugar, and lemon juice. Mix well to ensure all the strawberries are coated in sugar.", strawberryMilk);
        instructionRepository.save(smInstruction2);
        Instructions smInstruction3 = new Instructions("Turn the heat to medium and let it simmer for 15 minutes until the strawberry gets soft; keep stirring to prevent it from burning.", strawberryMilk);
        instructionRepository.save(smInstruction3);
        Instructions smInstruction4 = new Instructions("After 15 minutes, add the remaining strawberries and gently mix to cook for another 2 minutes.", strawberryMilk);
        instructionRepository.save(smInstruction4);
        Instructions smInstruction5 = new Instructions("Store the strawberry in a glass jar, and once it has cooled down, it can last in the fridge for three weeks.", strawberryMilk);
        instructionRepository.save(smInstruction5);
        Instructions smInstruction6 = new Instructions("Add around 2-4 tbsp syrup, pour in the milk, and ice. Shake it all up together when you are ready to drink!", strawberryMilk);
        instructionRepository.save(smInstruction6);

//        HORCHATA
        RecipeIngredient horchataIngredient1 = new RecipeIngredient(whiteRice, 1, "cup");
        recipeIngredientRepository.save(horchataIngredient1);
        RecipeIngredient horchataIngredient2 = new RecipeIngredient(sugar, 1, "cup");
        recipeIngredientRepository.save(horchataIngredient2);
        RecipeIngredient horchataIngredient3 = new RecipeIngredient(choppedAlmonds, 0.5, "cup");
        recipeIngredientRepository.save(horchataIngredient3);
        RecipeIngredient horchataIngredient4 = new RecipeIngredient(cinnamon, 1, "stick");
        recipeIngredientRepository.save(horchataIngredient4);
        RecipeIngredient horchataIngredient5 = new RecipeIngredient(vanilla, 1, "tbsp");
        recipeIngredientRepository.save(horchataIngredient5);
        RecipeIngredient horchataIngredient6 = new RecipeIngredient(evaporatedMilk, 340, "g");
        recipeIngredientRepository.save(horchataIngredient6);
        RecipeIngredient horchataIngredient7 = new RecipeIngredient(milk, 1.5, "cups");
        recipeIngredientRepository.save(horchataIngredient7);
        RecipeIngredient horchataIngredient8 = new RecipeIngredient(water, 1, "liter");
        recipeIngredientRepository.save(horchataIngredient8);
        RecipeIngredient horchataIngredient9 = new RecipeIngredient(ice, 1, "handful");
        recipeIngredientRepository.save(horchataIngredient9);

        Recipe horchata = new Recipe("Horchata", "My Latina Table", false, "Misc", "https://i.imgur.com/J5qC8k4.jpg", "Easy", 5.5, "https://www.youtube.com/embed/JtwqQEaxIQg");
        horchata.addIngredients(horchataIngredient1);
        horchata.addIngredients(horchataIngredient2);
        horchata.addIngredients(horchataIngredient3);
        horchata.addIngredients(horchataIngredient4);
        horchata.addIngredients(horchataIngredient5);
        horchata.addIngredients(horchataIngredient6);
        horchata.addIngredients(horchataIngredient7);
        horchata.addIngredients(horchataIngredient8);
        horchata.addIngredients(horchataIngredient9);
        recipeRepository.save(horchata);

        Instructions horchataInstruction1 = new Instructions("Start by soaking the rice, cinnamon, and almonds in a bowl of water all night, or at least for 5 hours so that the rice softens slightly.", horchata);
        instructionRepository.save(horchataInstruction1);
        Instructions horchataInstruction2 = new Instructions("Strain the water from the cinnamon, rice, and almond mixture that were soaking, disposing of water.", horchata);
        instructionRepository.save(horchataInstruction2);
        Instructions horchataInstruction3 = new Instructions("Blend the cinnamon, rice, and almond mixture with evaporated milk until a smoother mix is formed and the grains of rice are completely ground.", horchata);
        instructionRepository.save(horchataInstruction3);
        Instructions horchataInstruction4 = new Instructions("Strain the resulting liquid into a pitcher, and add the sugar, vanilla, and milk. Mix well until everything is well combined.Add a liter of water, and serve with ice. Enjoy!", horchata);
        instructionRepository.save(horchataInstruction4);
    }

}