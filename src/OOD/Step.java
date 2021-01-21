//package OOD;
//
//public class Step {
//}


// Steps:
//  1. understand/Analyze use case
//      use case : describe the parking lot building ?  Vehicle monitoring? what kind of parking lot?
//   Use cases -> APIs
//      For API, always ask yourself : input/output?
//      some other question that may affect your design:
//      One level or multiple levels?
//      Parking-spot/Vehicle sizes?
//      Track the location of each vehicle?
//

//  2. Classes and their relationships
//      single- responsibility principle: a class should have only one job
//      Vehicle, Parking Spot, level, Parking lot....
//
//      Class relationships:
//      Association: a general binary relationship that describe an activity between two classes.
//      Aggregation/ Composition: a special form of association, which represents an ownership.
//      relationship between two classes (has-a)
//      inheritance
//
//      Vehicle -- parking spot
//      level -- parking spot
//      parking Lot - level
//      Vehicle -- car, true
//
//      which design do you prefer?
//          1.ParkingLot - level -- parkingSpot
//          2.ParkingLot -- ParkingSpot
//
//
//     3. For complicated design, first focus on public methods
//
//
//
//
//