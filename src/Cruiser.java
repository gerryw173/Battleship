public class Cruiser extends Ship
{
    /**
     * Construct a Cruiser with a length
     * of 3 and the specified Locations.
     *
     * @param locations
     */
    public Cruiser(Location... locations)
    {
        for (int i = 0; i < locations.length; i++)
        {
            super.addLocation(locations);
        }
    }
}