public class PatrolBoat extends Ship
{
    /**
     * Construct a PatrolBoat with a length
     * of 2 and the specified Locations.
     *
     * @param locations
     */
    public PatrolBoat(Location... locations)
    {
        for (int i = 0; i < locations.length; i++)
        {
            super.addLocation(locations);
        }
    }
}