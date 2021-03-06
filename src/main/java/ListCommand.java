/**
 * Class to handle list commands entered by the user.
 * @author vanGoghhh
 */

public class ListCommand extends Command {

    private String command;

    /**
     * Constructor for list command object.
     * @param command Complete line of command entered by the user.
     */
    public ListCommand(String command) {
        this.command = command;
    }

    /**
     * Method to execute entirely when a list command is entered by the user.
     * @param tasks TaskList containing all the tasks.
     * @param dukeUI UI to print string responses by the bot.
     * @return String response by the bot.
     * @throws InvalidCommandException when an invalid command is entered by user.
     */
    @Override
    protected String execute(TaskList tasks, UI dukeUI) throws InvalidCommandException {
        this.checkCommandValidity();
        if (tasks.getTaskList().isEmpty()) {
            String str1 = "\nThere are currently no tasks stored!\n";
            return str1;
        } else {
            String dukeResponse = dukeUI.displayTasks(tasks);
            return dukeResponse;
        }
    }

    /**
     * Checks whether list command is valid.
     * @throws InvalidCommandException
     */
    protected void checkCommandValidity() throws InvalidCommandException{
        try {
            if (this.command.compareTo("list") != 0) {
                throw new InvalidCommandException();
            }
        } catch (InvalidCommandException e) {
            throw new InvalidCommandException();
        }
    }
}
