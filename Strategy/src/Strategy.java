public interface Strategy {
    public abstract Hand nextHand();	//������ ���� ���� ��´�.
    public abstract void study(boolean win);	//������ �� ���� �̰���� ������ �н�. �̱�� win = true, ���� win = false.
}
