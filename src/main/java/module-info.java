/**
 * The JPMS module for Starloader's fork of TableLayout.
 * This fork is maintained by starloader, not be the original maintainers of TableLayout, do not bother them
 * for support.
 */
module de.geolykt.starloader.tablelayout {
    requires transitive java.desktop;

    exports de.geolykt.starloader.layout;
}
