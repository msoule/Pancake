package msoule.pancake.model

/**
  * Hot off the Griddle, Here’s the History of Pancakes
  * by Rebecca Rupp
  * http://theplate.nationalgeographic.com/2014/05/21/hot-off-the-griddle-heres-the-history-of-pancakes/
  *
  * Our prehistoric ancestors just may have eaten pancakes.
  *
  * Analyses of starch grains on
  * 30,000-year-old grinding tools suggest that Stone Age cooks were making flour out of cattails
  * and ferns—which, researchers guess, was likely mixed with water and baked on a hot, possibly
  * greased, rock. The result may have been more akin to hardtack than the modern crepe, hotcake, or
  * flapjack, but the idea was the same: a flat cake, made from batter and fried.
  *
  * Pancake Day: The Most Wonderful Day of the Year
  *
  * By the time Otzi the Iceman set off on his final hike 5,300 years ago, pancakes—or at least
  * something pancake-like—seem to have been a common item of diet. Otzi, whose remains were
  * discovered in a rocky gully in the Italian Alps in 1991, provided us with a wealth of
  * information about what a denizen of the Neolithic ate. His last meals—along with red deer and
  * ibex—featured ground einkorn wheat. The bits of charcoal he consumed along with it suggest that
  * it was in the form of a pancake, cooked over an open fire.
  *
  * Whatever the age of the primal pancake, it’s clearly an ancient form of food, as evidenced by
  * its ubiquity in cultural traditions across the globe. The ancient Greeks and Romans ate pancakes,
  * sweetened with honey; the Elizabethans ate them flavored with spices, rosewater, sherry, and
  * apples. They were traditionally eaten in quantity on Shrove Tuesday or Pancake Day, a day of
  * feasting and partying before the beginning of Lent.  Pancakes were a good way to use up stores
  * of about-to-be-forbidden perishables like eggs, milk, and butter, and a yummy last hurrah before
  * the upcoming grim period of church-mandated fast.
  *
  * In the American colonies, pancakes—known as hoe cakes, johnnycakes, or flapjacks—were made with
  * buckwheat or cornmeal. Amelia Simmons’s American Cookery—thought to be the first all-American
  * cookbook, published in 1796—has two recipes for pancakes, one for “Johny Cake, or Hoe Cake,”
  * which calls for milk, “Indian meal,” and molasses, the other for “Indian Slapjack,” which drops
  * the molasses, but adds four eggs.
  *
  * Thomas Jefferson, who was fond of pancakes, sent a recipe home to Monticello from the
  * President’s House in Washington, D.C., picked up from Etienne Lemaire, his French maître d’hotel
  * (hired for his honesty and skill in making desserts). Lemaire’s “panne-quaiques” were what we
  * would call crepes—made by pouring dollops of thin batter into a hot pan.  Modern pancakes—in
  * Jefferson’s day known as griddlecakes—generally contain a leavening agent and are heftier and
  * puffier.
  *
  * Flat as a Pancake? Not Likely
  *
  * The defining characteristic of the entire vast family of pancakes, however—from crepe to
  * griddlecake, blini, bannock, and beyond—is flatness. “Flat as a pancake,” according to the
  * Oxford English Dictionary, has been a catchphrase since at least 1611. Usually it’s applied
  * disparagingly to flat-chested women or to featureless level terrain, such as that of Poland, the
  * glacial plains of Canada, and the state of Kansas.
  *
  * In 2003, this recurrent comparison led a trio of geographers with senses of humor—after a
  * dullish trip across the American Midwest—to attempt to determine the relative flatnesses of
  * pancakes and Kansas. They constructed a topographic profile of a representative pancake—bought
  * from the local International House of Pancakes—using digital imaging processing and a confocal
  * laser microscope, and a similar profile of Kansas, using data from the United States Geological
  * Survey. The tongue-in-cheek results, published in the Annals of Improbable Research, showed that
  * though pancakes are flat, Kansas is even flatter. Where, mathematically, a value of 1.000
  * indicates perfect tabletop flatness, Kansas scored a practically horizontal 0.9997. The pancake,
  * in contrast, scored a relatively lumpy 0.957.
  *
  * In March of this year, Kansan geographers Jerome Dobson and Joshua Campbell—publishing in the
  * wholly reputable Geographical Review – also took on pancakes, pointing out defensively that,
  * while Kansas may be flatter than a pancake, it’s not alone. In fact, there are several states
  * that are even flatter. Their calculations showed that, of the continental states, flattest of
  * the flat is Florida, followed by Illinois, North Dakota, Louisiana, Minnesota, and Delaware.
  * (Least pancake-like: Wyoming, West Virginia, New Hampshire, and Vermont.)
  *
  * As all researchers hasten to point out, though, the pancake comparison simply isn’t fair. Blow a
  * pancake up to the size of—say, Kansas—and you’ll end up with a fried expanse of ferociously
  * rugged terrain, pock-marked with craters and canyons, studded with Everest-sized air bubbles.
  * Compared to a Kansas-sized pancake—well, practically everything is flat.
  *
  * The 16th-century measure of flatness was “flat as a flounder.”
  *
  * Maybe we should go back to that.
  *
  * @param size The size of the pancake in pancake units.
  * @param sideUp The side facing up on the plate. May be Burnt or GoldenDeliciousness.
  */
case class Pancake(size: Integer, sideUp: PancakeSide)

object Pancake {

  class PancakeOrdering extends Ordering[Pancake] {
    override def compare(p1: Pancake, p2: Pancake): Int = {
      p1.size - p2.size
    }
  }

  val PancakeOrdering = new PancakeOrdering
}
