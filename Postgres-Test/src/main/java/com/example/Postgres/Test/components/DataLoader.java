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
        RawIngredient groundEspresso = new RawIngredient("Ground Espresso", "https://i.imgur.com/d5Kx6mA.jpg", Boolean.FALSE, "Because espresso is roasted, ground, and brewed differently, it has a unique flavor compared to drip coffee. It usually has a bolder, less acidic taste, with a well-rounded and full-bodied finish. It tastes “stronger,” meaning that it has a rich coffee flavor. The roasting process especially brings out more oils in the beans, so it often has a heavier feel. ");
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
        RawIngredient beet = new RawIngredient("Beet", "IMAGE", Boolean.FALSE, "Beetroot is the large and fleshy root growing in the plant of the same name, eaten as a vegetable. Its superficial, thin and smooth skin has a wide range of colours, from purple-pink and reddish-orange to a brownish tone. The pulp has a sweet taste and it is usually of a dark crimson red colour with purple tinges.");
        ingredientRepository.save(beet);
        RawIngredient carrot = new RawIngredient("Carrot", "IMAGE", Boolean.FALSE, "Carrot, (Daucus carota), herbaceous, generally biennial plant of the Apiaceae family that produces an edible taproot. Among common varieties root shapes range from globular to long, with lower ends blunt to pointed. Besides the orange-coloured roots, white-, yellow-, and purple-fleshed varieties are known.");
        ingredientRepository.save(carrot);
        RawIngredient ginger = new RawIngredient("Ginger", "IMAGE", Boolean.FALSE, "Ginger is a 2-4 feet tall slender perennial with grass-like leaves and greenish-yellow flowers. Once the leaves of the plant die, the thick rhizomes, about 6 inches long, are dug up. Ginger is often referred to as a root but this is technically incorrect.");
        ingredientRepository.save(ginger);
        RawIngredient water = new RawIngredient("Water", "IMAGE", Boolean.FALSE, "Water, a substance composed of the chemical elements hydrogen and oxygen and existing in gaseous, liquid, and solid states. It is one of the most plentiful and essential of compounds. A tasteless and odourless liquid at room temperature, it has the important ability to dissolve many other substances.");
        ingredientRepository.save(water);
        RawIngredient orange = new RawIngredient("Orange", "IMAGE", Boolean.FALSE, "The orange is a usually round or oval citrus; its rind and flesh are generally orange, except the varieties of red pulp. The edible part of the orange is the flesh, consumed in fresh or in juice. The orange is also used to make stewed fruit, jams, for consumption as dehydrated fruit, etc.");
        ingredientRepository.save(orange);
        RawIngredient ice = new RawIngredient("Ice", "IMAGE", Boolean.FALSE, "Ice is water in its frozen, solid form. Ice often forms on lakes, rivers and the ocean in cold weather. It can be very thick or very thin. It occurs as frost, snow, sleet and hail. Water will freeze at zero degrees Celsius (32 degrees Fahrenheit).");
        ingredientRepository.save(ice);
        RawIngredient strawberry = new RawIngredient("Strawberry", "IMAGE", Boolean.FALSE, "Strawberries are soft, sweet, bright red berries. They're also delicious. Strawberries have tiny edible seeds, which grow all over their surface. When ripe, strawberries smell wonderful and taste even better. You can make jam, pie, strawberry shortcake, and more with strawberries.");
        ingredientRepository.save(strawberry);
        RawIngredient watermelon = new RawIngredient("Watermelon", "IMAGE", Boolean.FALSE, "A large oblong or roundish fruit with a hard green or white rind often striped or variegated, a sweet watery pink, yellowish, or red pulp, and usually many seeds. 2 : A widely cultivated African vine (Citrullus lanatus synonym C. vulgaris) of the gourd family that bears watermelons.");
        ingredientRepository.save(watermelon);



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
                "https://www.youtube.com/embed/5DW0t34Lr5Y"
        );

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

        RecipeIngredient classicShandyIngredient1 = new RecipeIngredient(lemon, 2, "slices");
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

        // FRUIT JUICE

        RecipeIngredient carrotBeetJuiceIngredient1 = new RecipeIngredient(beet, 0.5, "Peeled and chopped");
        recipeIngredientRepository.save(carrotBeetJuiceIngredient1);
        RecipeIngredient carrotBeetJuiceIngredient2 = new RecipeIngredient(carrot, 4, "Peeled and chopped");
        recipeIngredientRepository.save(carrotBeetJuiceIngredient2);
        RecipeIngredient carrotBeetJuiceIngredient3 = new RecipeIngredient(ginger, 0.25, "Inch");
        recipeIngredientRepository.save(carrotBeetJuiceIngredient3);
        RecipeIngredient carrotBeetJuiceIngredient4 = new RecipeIngredient(water, 1, "120ml");
        recipeIngredientRepository.save(carrotBeetJuiceIngredient4);

        Recipe carrotBeetJuice = new Recipe(
                "Carrot Beet Juice",
                "Jack",
                true,
                "Fruit Juice",
                "IMAGE",
                "Easy",
                10,
                "https://www.youtube.com/embed/tkiUMKG92f0"
        );

        carrotBeetJuice.addIngredients(carrotBeetJuiceIngredient1);
        carrotBeetJuice.addIngredients(carrotBeetJuiceIngredient2);
        carrotBeetJuice.addIngredients(carrotBeetJuiceIngredient3);
        carrotBeetJuice.addIngredients(carrotBeetJuiceIngredient4);
        recipeRepository.save(carrotBeetJuice);
        Instructions carrotBeetJuiceInstruction1 = new Instructions("Process chopped beetroot, carrot, and ginger thorough juicer and collect juice in its container.", carrotBeetJuice);
        instructionRepository.save(carrotBeetJuiceInstruction1);
        Instructions carrotBeetJuiceInstruction2 = new Instructions("Squeeze lemon in it and stir well. Fill up serving glass with the juice and serve.", carrotBeetJuice);
        instructionRepository.save(carrotBeetJuiceInstruction2);


        RecipeIngredient orangeJuiceIngredient1 = new RecipeIngredient(orange, 3, "75ml");
        recipeIngredientRepository.save(orangeJuiceIngredient1);
        RecipeIngredient orangeJuiceIngredient2 = new RecipeIngredient(ice, 2, "Cubes");
        recipeIngredientRepository.save(orangeJuiceIngredient2);


        Recipe orangeJuice = new Recipe(
                "Orange Juice",
                "Jack",
                true,
                "Fruit Juice",
                "IMAGE",
                "Easy",
                10,
                "https://www.youtube.com/embed/aRisxe4IdVg"
        );

        orangeJuice.addIngredients(orangeJuiceIngredient1);
        orangeJuice.addIngredients(orangeJuiceIngredient2);
        recipeRepository.save(orangeJuice);
        Instructions orangeJuiceInstruction1 = new Instructions("Rinse oranges and pat dry them. Roll them on flat surface with little pressure to soften them and get juice easily. Cut them into halves crosswise.", orangeJuice);
        instructionRepository.save(orangeJuiceInstruction1);
        Instructions orangeJuiceInstruction2 = new Instructions("Place each half on a electric or hand citrus juicer, press and twist to get juice. You can also squeeze out juice with your hand by squeezing it like lemon.", orangeJuice);
        instructionRepository.save(orangeJuiceInstruction2);
        Instructions orangeJuiceInstruction3 = new Instructions("Remove seeds and pour it into chilled serving glass. Add ice cubes and garnish with orange wheel, serve chilled", orangeJuice);
        instructionRepository.save(orangeJuiceInstruction3);



        RecipeIngredient strawberryJuiceIngredient1 = new RecipeIngredient(strawberry, 2, "Cup");
        recipeIngredientRepository.save(strawberryJuiceIngredient1);
        RecipeIngredient strawberryJuiceIngredient2 = new RecipeIngredient(lime, 2, "Tbsp");
        recipeIngredientRepository.save(strawberryJuiceIngredient2);
        RecipeIngredient strawberryJuiceIngredient3 = new RecipeIngredient(sugar, 1, "Tbsp");
        recipeIngredientRepository.save(strawberryJuiceIngredient3);
        RecipeIngredient strawberryJuiceIngredient4 = new RecipeIngredient(water, 1, "Cup");
        recipeIngredientRepository.save(strawberryJuiceIngredient4);
        RecipeIngredient strawberryJuiceIngredient5 = new RecipeIngredient(ice, 2, "Cubes");
        recipeIngredientRepository.save(strawberryJuiceIngredient5);

        Recipe strawberryJuice = new Recipe(
                "Strawberry Juice",
                "Jack",
                true,
                "Fruit Juice",
                "IMAGE",
                "Easy",
                5,
                "https://www.youtube.com/embed/6X-z0JaaSgM"
        );

        strawberryJuice.addIngredients(strawberryJuiceIngredient1);
        strawberryJuice.addIngredients(strawberryJuiceIngredient2);
        strawberryJuice.addIngredients(strawberryJuiceIngredient3);
        strawberryJuice.addIngredients(strawberryJuiceIngredient4);
        strawberryJuice.addIngredients(strawberryJuiceIngredient5);
        recipeRepository.save(strawberryJuice);
        Instructions strawberryJuiceInstruction1 = new Instructions("Wash strawberries, remove stem and cut into small pieces.", strawberryJuice);
        instructionRepository.save(strawberryJuiceInstruction1);
        Instructions strawberryJuiceInstruction2 = new Instructions("Add strawberries, sugar and juice from lime (you can change the quantity of sugar and lime according to how ripe the strawberries are) in a blender.", strawberryJuice);
        instructionRepository.save(strawberryJuiceInstruction2);
        Instructions strawberryJuiceInstruction3 = new Instructions("Blend until smooth puree. Add water and blend again for a minute.", strawberryJuice);
        instructionRepository.save(strawberryJuiceInstruction3);
        Instructions strawberryJuiceInstruction4 = new Instructions("Place a fine mesh strainer over a large container and pour prepared juice over it to remove the foam results during blending. You can also use a cheesecloth to remove the foam. This step is optional.", strawberryJuice);
        instructionRepository.save(strawberryJuiceInstruction4);
        Instructions strawberryJuiceInstruction5 = new Instructions("Add one ice cubes in each of the glasses and pour sweet and sour fresh strawberry fruit juice over it. Place halved strawberry on rim of each glass to give it a tempting look and serve.", strawberryJuice);
        instructionRepository.save(strawberryJuiceInstruction5);


        RecipeIngredient watermelonJuiceIngredient1 = new RecipeIngredient(watermelon, 1, "Small watermelon");
        recipeIngredientRepository.save(watermelonJuiceIngredient1);
        RecipeIngredient watermelonJuiceIngredient2 = new RecipeIngredient(lime, 3, "Tbsp");
        recipeIngredientRepository.save(watermelonJuiceIngredient2);
        RecipeIngredient watermelonJuiceIngredient3 = new RecipeIngredient(ice, 4, "Cubes");
        recipeIngredientRepository.save(watermelonJuiceIngredient3);

        Recipe watermelonJuice = new Recipe(
                "Watermelon Juice",
                "Jack",
                true,
                "Fruit Juice",
                "IMAGE",
                "Easy",
                10,
                "https://www.youtube.com/embed/145WlH4OO04"
        );

        watermelonJuice.addIngredients(watermelonJuiceIngredient1);
        watermelonJuice.addIngredients(watermelonJuiceIngredient2);
        watermelonJuice.addIngredients(watermelonJuiceIngredient3);
        recipeRepository.save(watermelonJuice);
        Instructions watermelonJuiceInstruction1 = new Instructions("Cut watermelon into large pieces and discard the skin. Remove black seeds, no need to take the white seeds out.", watermelonJuice);
        instructionRepository.save(watermelonJuiceInstruction1);
        Instructions watermelonJuiceInstruction2 = new Instructions("Add watermelon pieces in a blender jar.", watermelonJuice);
        instructionRepository.save(watermelonJuiceInstruction2);
        Instructions watermelonJuiceInstruction3 = new Instructions("Blend until smooth texture. Transfer it to a large bowl and mix lime juice. If watermelon is sweet, no need to add sugar, but if it is not, taste the juice and if required, add sugar. Add 1-ice cube in each serving glass and pour prepared watermelon juice into it.", watermelonJuice);
        instructionRepository.save(watermelonJuiceInstruction3);


    }
}