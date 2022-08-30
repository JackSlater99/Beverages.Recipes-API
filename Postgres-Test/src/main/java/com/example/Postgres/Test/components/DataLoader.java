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

        // COFFEE

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

        // MOCKTAILS

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


//        FRUIT
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
    }

}