package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int raccoonsPlayingInWoods = 3;
		int raccoonsThatLeft = 2;
		int raccoonsRemaining = raccoonsPlayingInWoods - raccoonsThatLeft;
		System.out.println(raccoonsRemaining);
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int flowers = 5;
		int bees = 3;
		int beesLessThanFlowers = flowers - bees;
		System.out.println(beesLessThanFlowers);
			
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int firstPigeonEating = 1;
		int secondPigeonEating = 1;
		int pigeonsEatingBreadcrumbs = firstPigeonEating + secondPigeonEating;
		System.out.println(pigeonsEatingBreadcrumbs);
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int owlsSittingOnFence = 3;
		int newOwls = 2;
		int totalOwlsOnFence = owlsSittingOnFence + newOwls;
		System.out.println(totalOwlsOnFence);
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
		int beaversWorking = 2;
		int beaversSwimming = 1;
		int beaversNowWorking = beaversWorking - beaversSwimming;
		System.out.println(beaversNowWorking);
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int toucansSitting = 2;
		int toucanThatJoined = 1;
		int totalOfToucans = toucansSitting + toucanThatJoined;
		System.out.println(totalOfToucans);

        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrelsInTree = 4;
		int nuts = 2;
		int moreSquirrelsThanNuts = squirrelsInTree - nuts;
		System.out.println(moreSquirrelsThanNuts);

        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		double quartersWorth = .25;
		double dimesValue = .10;
		double nickelsWorth = .10;
		double amountOfMoney = quartersWorth + dimesValue + nickelsWorth;
		System.out.println(amountOfMoney);
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		int mrsBriersClass = 18;
		int mrsMacadamsClass = 20;
		int mrsFlannerysClass = 17;
		int totalOfMuffins = mrsBriersClass + mrsMacadamsClass + mrsFlannerysClass;
		System.out.println(totalOfMuffins);
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
	//  int costOfYoyo = 24;
	//	int whistlePrice = 14;
	//	int moneySpent = costOfYoyo + whistlePrice;
		
		double costOfYoyo = .24;
		double whistlePrice = .14;
		double moneySpent = costOfYoyo + whistlePrice;
		System.out.println(moneySpent);
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallows = 8;
		int miniMarshmallows = 10;
		int totalOfMarshmallows = largeMarshmallows + miniMarshmallows;
				
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int snowAtHouse = 29;
		int snowAtElementarySchool = 17;
		int moreSnowAtHouse = snowAtHouse - snowAtElementarySchool;
		System.out.println(moreSnowAtHouse);
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int startingMoney = 10;
		int costOfTruck = 3;
		int costOfPencilCase = 2;
		int moneyLeft = startingMoney - costOfTruck - costOfPencilCase;
		
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int marblesInCollection = 16;
		int marblesJoshLost = 7;
		int totalOfMarblesLeft = marblesInCollection - marblesJoshLost;
		
        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int shellsMeganWants = 25;
		int shellsSheCurrentlyHas = 19;
		int shellsSheNeeds = shellsMeganWants - shellsSheCurrentlyHas;
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalBalloons = 18;
		int balloonsThatAreRed = 8;
		int greenBalloonsHeHas = totalBalloons - balloonsThatAreRed;
		
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int currentBooksOnShelf = 38;
		int booksMartaPutOn = 10;
		int totalOfBooks = currentBooksOnShelf - booksMartaPutOn;
		
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int singleBeeLegs = 6;
		int amountOfBees = 8;
		int totalOfBeeLegs = singleBeeLegs * amountOfBees;
		System.out.println(totalOfBeeLegs);
        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double costOfIceCreamCone = .99;
		double amountOfCones = 2;
		double moneySpentOnIceCream = costOfIceCreamCone * amountOfCones;
		System.out.println(moneySpentOnIceCream);
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int totalOfRocks = 125;
		int rocksSheHas = 64;
		int rocksNeeded = totalOfRocks - rocksSheHas;
		
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int mrsHiltsMarbles = 38;
		int lostMarbles = 15;
		int newAmountOfMarbles = mrsHiltsMarbles - lostMarbles;
		
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
		int totalOfMiles = 78;
		int milesDriven = 32;
		int milesLeftToDrive = totalOfMiles - milesDriven;
		
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		int minutesSpentSaturdayMorning = 90;
		int minutesSpentInAfternoon = 45;
		int totalMinutesShoveling = minutesSpentSaturdayMorning + minutesSpentInAfternoon;
		
		
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		double totalOfHotdogs = 6;
		double costOfEachHotdog = .50;
		double amountForAllHotdogs = totalOfHotdogs * costOfEachHotdog;
		System.out.println(amountForAllHotdogs);
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int mrsHiltsMoney = 50;
		int costOfEachPencil = 7;
		int howManyPencils = mrsHiltsMoney / costOfEachPencil;
		System.out.println(howManyPencils);
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalButterflies = 33;
		int orangeButterflies = 20;
		int redButterflies = totalButterflies - orangeButterflies;
		
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double moneyGivenToClerk = 1;
		double costOfCandy = .54;
		double moneyLeftover = moneyGivenToClerk - costOfCandy;
		System.out.println(moneyLeftover);
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int currentTrees = 13;
		int treesPlanted = 12;
		int newTreeTotal = currentTrees + treesPlanted;
		
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int hours = 24;
		int numberOfDays = 2;
		int totalOfHours = hours * numberOfDays;
		
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int numberOfCousins = 4;
		int gumForEachCousin = 5;
		int totalGumSticks = numberOfCousins * gumForEachCousin;
		
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		float dansStartingMoney = 3.00f;
		float candyBarCost = 1.00f;
		float leftoverMoney = dansStartingMoney - candyBarCost;
		System.out.println(leftoverMoney);
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int numberOfBoats = 5;
		int peopleOnBoats = 3;
		int totalPeopleOnBoats = numberOfBoats * peopleOnBoats;
		
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int startingLegos = 380;
		int lostLegos = 57;
		int legosRemaining = startingLegos - lostLegos;
		
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int muffinTotal = 83;
		int muffinsBaked = 35;
		int muffinsStillNeeded = muffinTotal - muffinsBaked;
		
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willysCrayons = 1400;
		int lucysCrayons = 290;
		int moreCrayonsThanLucy = willysCrayons - lucysCrayons;
		
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int stickersOnPage = 10;
		int numberOfPages = 22;
		int totalOfStickers = stickersOnPage * numberOfPages;
		
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int numberOfCupcakes = 96;
		int amountOfChildren = 8;
		int cupcakesForEachChild = 96 / 8;
		System.out.println(cupcakesForEachChild);
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int gingerbreadCookies = 47;
		int cookiesInEachJar = 6;
		int cookiesLeftOut = 47 % 6;
		System.out.println(cookiesLeftOut);
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		double croissants = 59;
		double neighbors = 8;
		double croissantsEachNeighborGets = croissants / neighbors;
		System.out.println(croissantsEachNeighborGets);
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int cookiesOnTray = 12;
		int cookiesNeeded = 276;
		int totalTrays = cookiesNeeded / cookiesOnTray;
		
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int biteSizedPretzels = 480;
		int servingSize = 12;
		int totalServingsPrepared = biteSizedPretzels / servingSize;
		
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int cakesBaked = 53;
		int cakesAtHome = 2;
		int cakesInBox = 3;
		int totalBoxes = (cakesBaked - cakesAtHome) / cakesInBox;
		System.out.println(totalBoxes);
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotsPrepared = 74;
		int people = 12;
		int carrotsLeftover = carrotsPrepared % people;
		System.out.println(carrotsLeftover);
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int totalTeddyBears = 98;
		int fitOnShelves = 7;
		int filledShelves = 98 / 7;
		System.out.println(filledShelves);
		
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int totalPictures = 480;
		int albumContains = 20;
		int totalAlbums = totalPictures / albumContains;
		
		
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int cardsCollected = 94;
		int cardInBox = 8;
		int cardsInUnfilledBox = 94 % 8;
		
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int numberOfBooks = 210;
		int totalShelves = 10;
		int booksOnShelves = 210 / 10;
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		double crouissantsBaked = 17;
		double guests = 7;
		double croissantsPerGuest = 17 / 7;
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */

        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */


	}

}
