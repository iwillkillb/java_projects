public interface Strategy {
    public abstract Hand nextHand();	//다음에 내는 손을 얻는다.
    public abstract void study(boolean win);	//직전에 낸 손이 이겼는지 졌는지 학습. 이기면 win = true, 지면 win = false.
}
