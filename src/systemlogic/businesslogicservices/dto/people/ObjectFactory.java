//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.14 at 10:13:04 PM CET 
//


package systemlogic.businesslogicservices.dto.people;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the systemlogic.businesslogicservices.dto.people package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: systemlogic.businesslogicservices.dto.people
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeopleView }
     * 
     */
    public PeopleView createPeople() {
        return new PeopleView();
    }

    /**
     * Create an instance of {@link PeopleView.Person }
     * 
     */
    public PeopleView.Person createPeoplePerson() {
        return new PeopleView.Person();
    }

    /**
     * Create an instance of {@link PeopleView.Person.HealthProfile }
     * 
     */
    public PeopleView.Person.HealthProfile createPeoplePersonHealthProfile() {
        return new PeopleView.Person.HealthProfile();
    }

    /**
     * Create an instance of {@link PeopleView.Person.HealthProfile.MeasureType }
     * 
     */
    public PeopleView.Person.HealthProfile.MeasureType createPeoplePersonHealthProfileMeasureType() {
        return new PeopleView.Person.HealthProfile.MeasureType();
    }

}
