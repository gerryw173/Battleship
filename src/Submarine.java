public class Submarine extends Ship
{
    /**
     * Construct a Submarine with a length
     * of 3 and the specified Locations.
     *
     * @param locations
     */
    public Submarine(Location... locations)
    {
        for (int i = 0; i < locations.length; i++)
        {
            super.addLocation(locations);
        }
    }
}