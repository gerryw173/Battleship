public class AircraftCarrier extends Ship
{
    /**
     * Construct an AircraftCarrier with a length
     * of 5 and the specified Locations.
     *
     * @param locations
     */
    public AircraftCarrier(Location... locations)
    {
        for (int i = 0; i < locations.length; i++)
        {
            super.addLocation(locations);
        }
    }
}
