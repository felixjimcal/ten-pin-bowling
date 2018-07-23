# Ten-pin-bowling kata

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

You need an IDE to run the test in Java

Like Eclipse in Ubuntu 14.04
```
sudo add-apt-repository ppa:ubuntu-desktop/ubuntu-make
sudo apt-get update
sudo apt-get install ubuntu-make
umake ide eclipse
```
## Running the tests

To run the test just open it with the IDE and press "run all test" button

### Break down into end to end tests
The test shows you a bowling ten-pin game, testing the game, frame, spare, strike anda perfect game.

Feel free to change the values in tests

For example in test
```
	@Test
	public void OneSpare() 
	{
		// Turn
		bowling.Roll(5); // first roll
		bowling.Roll(5); // second roll = spare
		bowling.Roll(3);
		
		RollMany(17, 0);
		
		assertEquals(16, bowling.scoredPoints());
	}
```

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Felix Jimenez Calvo** - *Initial work* - [felixjimcal](https://github.com/felixjimcal)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* The people who challenge me to improve my knowledge
